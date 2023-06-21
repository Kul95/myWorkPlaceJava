package com.myPractice.thisKey;

public class Test {
    int x;

    void demo() {

        System.out.println(x);

    }

    void setValue(int x) {
        this.x = x;

    }
}

class Demo {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.setValue(26);
        obj.demo();
    }
}
