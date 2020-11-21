package creational.builder_interfaces;

import creational.builder_interfaces.interfaces.PrepareTea;
import creational.builder_interfaces.models.Herbs;
import creational.builder_interfaces.models.Mug;
import creational.builder_interfaces.models.Water;
import org.junit.jupiter.api.Test;
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

    @Mock
    Tea.TeaBuilder teaBuilder = mock(Tea.TeaBuilder.class);

    @Test
    void shouldTeaBuilderCreateTeaObject() {
        when(teaBuilder.makeTea()).thenReturn(teaObject);
        assertEquals(teaObject, teaBuilder.makeTea());
    }
}