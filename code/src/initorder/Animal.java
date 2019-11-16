/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package initorder;

public class Animal {

    static {
        System.out.println("Animal staic block");
    }

    {
        System.out.println("Animal non-static block");
    }

    public Animal() {
        System.out.println("Animal constructor");
    }

}
