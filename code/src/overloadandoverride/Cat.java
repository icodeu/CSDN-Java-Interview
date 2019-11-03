package overloadandoverride;


import java.io.IOException;

public class Cat extends Animal {

    private String name;

    private int age;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat(String food) {
        System.out.println("cat eat " + food);
    }

    public int eat(String food, String country) {
        System.out.println("cat eat " + food + " made in " + country);
        return 0;
    }

    public String eat(String food, int count) {
        System.out.println("cat eat " + count + food);
        return "";
    }
}
