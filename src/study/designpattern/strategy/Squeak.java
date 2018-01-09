package study.designpattern.strategy;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("삑");
    }
}
