package vut;

/**
 *
 * @author jane
 */
public class Main {

    public static void main(String[] args) {

        ITStudent obj = new ITStudent();
        obj.display();
        obj.details();

    }

}

class Student {

    String studentName, studentCourse, studentNumber, studentMainModule;

    void display() {
        System.out.println("Hi I am a VUT Student");

    }

}

class ITStudent extends Student {

    void details() {
        studentName = "Jane";
        studentCourse = "Information Technology";
        System.out.println("My name is " + studentName + '\n' + "My course is " + studentCourse);
    }
}
