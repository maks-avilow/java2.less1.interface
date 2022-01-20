package Hm;

public class People implements Actions {
    private String name;
    private int distanse;
    private int jump;

    public People (String name, int distanse, int jump) {
        this.name = name;
        this.distanse = distanse;
        this.jump = jump;
    }
    @Override
    public void run() {
        System.out.println("Человек" + this.name + "пробежал" + getDistanse());
    }
    @Override
    public void jumping() {
        System.out.println("Человек" + this.name + "прыгнул" + getJump());
    }

    public int getDistanse() {
        return distanse;
    }
    public int getJump() {
        return jump;
    }
}
