package lesson5;

public class Animal {
    String name;
    int limitRun;
    int limitSail;
    double limitJump;

    public Animal(String name) {this.name = name;}

    public void run(int i, int l) {
        int sum = i + l;
        int limit = limitRun + l;
        if (sum > limitRun + l) {System.out.println(" cannot run more then " + limit + " meter!");}
        else {System.out.println(" run " + sum + " meter!");}
    };

    public void sail(int i, int l) {
        int sum = i + l;
        int limit = limitSail + l;
        if (sum > limitSail + l) {System.out.println(" cannot sail more then " + limit + " meter!");}
        else {System.out.println(" sail " + sum + " meter!");}
    };

    public void jump(double i, double l) {
        double sum = i + l;
        double limit = limitJump + l;
        if (sum > limitJump + l) {System.out.println(" cannot jump more then " + limit + " meter!");}
        else {System.out.println(" jump " + sum + " meter!");}
    };
}
