/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package valuereference;

public class Main {

    public static void main(String[] args) {

        // 基本类型
        int intValue = 18;
        changeInt(intValue);
        System.out.println(intValue);

        // 包装类型 - 不可变类
        Integer integerValue = 18;
        changeInt(integerValue);
        System.out.println(integerValue);

        // String - 不可变类
        String strValue = "CSDN";
        changeString(strValue);
        System.out.println(strValue);

        // 自定义类
        Person person = new Person();
        person.setName("CSDN");
        person.setAge(18);
        changePerson(person);
        System.out.println(person);
    }

    private static void changeInt(int value) {
        value = 20;
    }

    private static void changeInteger(Integer value) {
        value = 20;
    }

    private static void changeString(String value) {
        value = "CSDN-changed";
    }

    private static void changePerson(Person person) {
        person.setName("CSDN-changed");
        person.setAge(20);
    }

}
