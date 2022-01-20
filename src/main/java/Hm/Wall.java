package Hm;

public class Wall extends Barrier {
 private int heigth;

    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    public Wall(String name) {
        super(name);

    }

    @Override
    public boolean go(People people) {
        System.out.println("Человек" + super.getName() + "высота стены" + getHeigth());
        people.jumping();
        if (getHeigth() <= people.getJump()){
            System.out.println( "Человек прыгнул успешно");
            return true;
        } else {
            System.out.println("Человек не прыгнул");
        } return false;
    }

    @Override
    public boolean go(Robot robot) {
        System.out.println("Робот" + super.getName() + "высота стены" + getHeigth() );
        robot.jumping();
        if (getHeigth() <= robot.getJump()){
            System.out.println( "Робот прыгнул успешно");
            return true;
        } else {
            System.out.println("Робот не прыгнул");
        } return false;

    }

    @Override
    public boolean go(Cat cat) {
        System.out.println("Котик" + super.getName() + "высота стены" + getHeigth());
        cat.jumping();
        if (getHeigth() <= cat.getJump()){
            System.out.println( "Котик прыгнул успешно");
            return true;
        } else {
            System.out.println("Котик не прыгнул");
        } return false;
    }

    public int getHeigth() {
        return heigth;
    }
}
