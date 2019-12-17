package lesson5;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
        limitRun = 5;
        limitJump = 0.2;
    }

    @Override
    public void run(int i, int l) {
        System.out.print("Bird " + name);
        super.run(i, l);
    }

    @Override
    public void sail(int i, int l) {
        System.out.print("Bird cannot sail");
    }

    @Override
    public void jump(double i, double l) {
        System.out.print("Bird " + name);
        super.jump(i, l);
    }
}
