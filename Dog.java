package lesson5;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        limitRun = 500;
        limitSail = 10;
        limitJump = 0.5;
    }

    @Override
    public void run(int i, int l) {
        System.out.print("Dog " + name);
        super.run(i, l);
    }

    @Override
    public void sail(int i, int l) {
        System.out.print("Dog " + name);
        super.sail(i, l);
    }

    @Override
    public void jump(double i, double l) {
        System.out.print("Dog " + name);
        super.jump(i, l);
    }
}
