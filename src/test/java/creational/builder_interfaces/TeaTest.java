package creational.builder_interfaces;

import creational.builder_interfaces.models.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class TeaTest {

    private final Tea teaObject = Tea.builder()
            .withMugFirst(new Mug())
            .withLiquid(new Water())
            .thenWithTeaPouch(new Herbs())
            .lastStep()
            .makeTea();

    @Mock IContainer mugMock;
    @Mock ILiquid waterMock;
    @Mock ITeaPouch teaPouch;
    @InjectMocks Tea.TeaBuilder teaBuilder = mock(Tea.TeaBuilder.class);

    @Test
    void shouldTeaBuilderCreateTeaObject() {
        when(teaBuilder.makeTea()).thenReturn(teaObject);
        assertEquals(teaObject, teaBuilder.makeTea());
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