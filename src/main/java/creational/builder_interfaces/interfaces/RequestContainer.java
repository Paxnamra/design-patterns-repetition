package creational.builder_interfaces.interfaces;

import creational.builder_interfaces.models.IContainer;

public interface RequestContainer {
    AddContainer withMugFirst(IContainer mug);
}
