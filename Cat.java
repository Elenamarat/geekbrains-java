package lesson5;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        limitRun = 200;
        limitJump = 2.0;
    }

    @Override
    public void run(int i, int l) {
        System.out.print("Cat " + name);
        super.run(i, l);
    }

    @Override
    public void sail(int i, int l) {
        System.out.print("Cat cannot sail");
    }

    @Override
    public void jump(double i, double l) {
        System.out.print("Cat " + name);
        super.jump(i, l);
    }
}
