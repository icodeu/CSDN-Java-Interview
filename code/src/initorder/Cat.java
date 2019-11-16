/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package initorder;

public class Cat extends Animal {

    static {
        System.out.println("Cat static block");
    }

    {
        System.out.println("Cat non-static block");
    }

    public Cat() {
        System.out.println("Cat constructor");
    }
}
