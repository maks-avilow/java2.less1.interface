package Hm;

public class RunRoad extends Barrier {
private int lengthRun;

    @Override
    public boolean go(People people) {
        System.out.println("Человек" + super.getName() + "длина дорожки"  + getLengthRun() );
        people.run();
        if (getLengthRun() <= people.getDistanse()){
            System.out.println( "Человек пробежал успешно");
         return true;
    } else {
            System.out.println("Человек не пробежал");
        } return false;
    }

    @Override
    public boolean go(Robot robot) {
        System.out.println("Робот" + super.getName() + "длина дорожки"  +  getLengthRun());
        robot.run();
        if (getLengthRun() <= robot.getDistanse()){
            System.out.println( "Робот пробежал успешно");
            return true;
        } else {
            System.out.println("Робот не пробежал");
        } return false;

    }
    @Override
    public boolean go(Cat cat) {
        System.out.println("Котик" + super.getName() + "длина дорожки" + getLengthRun() );
        cat.run();
        if (getLengthRun() <= cat.getDistanse()){
            System.out.println( "Котик пробежал успешно");
            return true;
        } else {
            System.out.println("Котик не пробежал");
        } return false;
    }

    public RunRoad(String name, int lengthRun) {
        super(name);
        this.lengthRun = lengthRun;
    }

    public int getLengthRun() {
        return lengthRun;
    }
}

