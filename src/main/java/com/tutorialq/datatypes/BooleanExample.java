package com.tutorialq.datatypes;

public class BooleanExample {

    public static void main(String[] args) {
        boolean flag1 = false, flag2 = false;
        System.out.println("Inside main method of BooleanExample --> flag1: " + flag1 + " flag2: " + flag2);
        flag1 = true;
        System.out.println("Updated the value --> flag: " + flag1);
        System.out.println("Check if the flags are same: " + (flag1 == flag2));
    }
}
