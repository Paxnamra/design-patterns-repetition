package creational.builder_interfaces;

import creational.builder_interfaces.models.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class TeaTest {

    private Tea teaObject;
    private Tea detailedTeaObject;

    @BeforeEach
    void setUp() {
        teaObject = Tea.builder()
                .withMugFirst(new Mug())
                .withLiquid(new Water())
                .thenWithTeaPouch(new Herbs())
                .lastStep()
                .makeTea();

        detailedTeaObject = Tea.builder()
                .withMugFirst(new Glass("pink"))
                .withTeaPouch(new TeaPouch("herbs"))
                .thenWithLiquid(new Water())
                .lastStep()
                .makeTea();
    }

    @Mock IContainer mugMock;
    @Mock ILiquid waterMock;
    @Mock ITeaPouch teaPouch;
    @InjectMocks Tea.TeaBuilder teaBuilder = mock(Tea.TeaBuilder.class);

    @Test
    void shouldTeaBuilderCreateTeaObjects() {
        when(teaBuilder.makeTea()).thenReturn(teaObject);
        assertEquals(teaObject, teaBuilder.makeTea());
    }

    @Test
    void shouldTeaBuilderCreateDetailedTeaObject() {
        when(teaBuilder.makeTea()).thenReturn(detailedTeaObject);
        assertEquals(detailedTeaObject.getMug().toString(), "Glass{colour='pink'}");
        assertEquals(detailedTeaObject.getTeabag().toString(), "TeaPouch{pouchType='herbs'}");
        assertEquals(detailedTeaObject, teaBuilder.makeTea());
    }

    @Test
    void shouldTeaBuilderCallAllInterfacesInOrder() {
        teaBuilder.withMugFirst(mugMock);
        teaBuilder.withLiquid(waterMock);
        teaBuilder.withTeaPouch(teaPouch);
        teaBuilder.lastStep();
        teaBuilder.makeTea();

        InOrder order = inOrder(teaBuilder);
        order.verify(teaBuilder, times(1)).withMugFirst(mugMock);
        order.verify(teaBuilder, times(1)).withLiquid(waterMock);
        order.verify(teaBuilder, times(1)).withTeaPouch(teaPouch);
        order.verify(teaBuilder, times(1)).lastStep();
        order.verify(teaBuilder, times(1)).makeTea();
    }
}