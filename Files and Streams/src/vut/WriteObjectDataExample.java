package vut;

import java.io.*;

/**
 *
 * @author User
 */
class Student implements Serializable {

    private String name;
    private int age;

    public Student() {
    }
   
    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class WriteObjectDataExample {

    public static void main(String[] args) {

        Student obj = new Student("Tebogo", 21);
        try {
            FileOutputStream fos = new FileOutputStream("student.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            System.out.println("Student object written to student.dat fileo");
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
