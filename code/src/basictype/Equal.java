package basictype;

import java.util.ArrayList;
import java.util.List;

public class Equal {

    public static void main(String[] args) {
        int a = 100;
        Integer b = 100;
        System.out.println("a == b " + (a == b));

        Integer c = new Integer(100);
        Integer d = new Integer(100);
        System.out.println("c == d " + (c == d));

        Integer e = 200;
        Integer f = 200;
        System.out.println("e == f " + (e == f));
        System.out.println("e equals f " + (e.equals(f)));

        Integer g = 100;
        String h = "100";
        System.out.println("g equals h " + (g.equals(h)));
    }

}
