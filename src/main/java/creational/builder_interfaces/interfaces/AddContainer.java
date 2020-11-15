package creational.builder_interfaces.interfaces;

import creational.builder_interfaces.models.ILiquid;
import creational.builder_interfaces.models.ITeaPouch;

public interface AddContainer {
    AddLiquid withLiquid(ILiquid liquid);
    AddTeaPouch withTeaPouch(ITeaPouch teaPouch);
}
