package overloadandoverride;


public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.eat("fish");
        cat.eat("fish", "China");
        cat.eat("fish", 3);

    }

}
