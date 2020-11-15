package creational.builder_interfaces;

import creational.builder_interfaces.models.Glass;
import creational.builder_interfaces.models.Mug;
import creational.builder_interfaces.models.TeaPouch;
import creational.builder_interfaces.models.Water;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello customer!\nWait a moment. Now preparing your tea...");

        Tea greenTea = Tea.builder()
                .withMugFirst(new Mug(true))
                .withTeaPouch(new TeaPouch())
                .thenWithLiquid(new Water())
                .lastStep()
                .makeTea();

        System.out.println(greenTea);
        System.out.println("Tea has been successfully prepared!");

        Tea unusualTea = Tea.builder()
                .withMugFirst(new Glass("blue"))
                .withLiquid(new Water())
                .thenWithTeaPouch(new TeaPouch())
                .lastStep()
                .makeTea();

        System.out.println("\nPreparing another tea...");
        System.out.println(unusualTea);
        System.out.println("Success!");
    }
}