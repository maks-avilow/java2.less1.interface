package Hm;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    public abstract boolean go(People people);

    public abstract boolean go(Robot robot);

    public abstract boolean go(Cat cat);

    public String getName() {
        return name;
    }
}
