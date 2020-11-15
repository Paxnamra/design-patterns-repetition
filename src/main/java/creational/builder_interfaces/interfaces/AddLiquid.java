package creational.builder_interfaces.interfaces;

import creational.builder_interfaces.models.ITeaPouch;

public interface AddLiquid {
    AddTeaPouchAfterLiquid thenWithTeaPouch(ITeaPouch teaPouch);
}
