package lesson5;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
        limitRun = 1500;
        limitSail = 100;
        limitJump = 3.0;
    }

    @Override
    public void run(int i, int l) {
        System.out.print("Horse " + name);
        super.run(i, l);
    }

    @Override
    public void sail(int i, int l) {
        System.out.print("Horse " + name);
        super.sail(i, l);
    }

    @Override
    public void jump(double i, double l) {
        System.out.print("Horse " + name);
        super.jump(i, l);
    }
}
