package Hm;

public class Cat implements Actions {
 private String name;
 private int distanse;
 private int jump;

    public Cat(String name, int distanse, int jump) {
        this.name = name;
        this.distanse = distanse;
        this.jump = jump;
        }

    @Override
    public void run() {
        System.out.println("Котик" + this.name + "пробежал" + this.getDistanse());

    }

    @Override
    public void jumping() {
        System.out.println("Котик" + this.name + "прыгнул" + this.getJump());
    }
    public int getDistanse() {
        return distanse;
    }
    public int getJump() {
        return jump;
    }
}
