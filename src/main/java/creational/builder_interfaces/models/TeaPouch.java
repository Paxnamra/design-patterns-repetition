package creational.builder_interfaces.models;

public class TeaPouch implements ITeaPouch {
    private String pouchType;

    public TeaPouch() {
        this.pouchType = "ordinary black pouch";
    }

    public TeaPouch(String pouchType) {
        this.pouchType = pouchType;
    }

    @Override
    public String toString() {
        return "TeaPouch{" +
                "pouchType='" + pouchType + '\'' +
                '}';
    }


}