package vut;

/**
 *
 * @author jane
 */
public class Multilevel {

    public static void main(String[] args) {

    }
}

class ParentClass {

    protected String name;

    void met1() {
        System.out.println("My name is " + name);
    }

}

class SubClass1 extends ParentClass {

    private String name2;

    void met2() {
        System.out.println("My name2 is: " + name2);
    }

}

class SubClass2 extends SubClass1 {

    String name3;

    void met3() {
        System.out.println("My name3 is " + name3);
    }

}
