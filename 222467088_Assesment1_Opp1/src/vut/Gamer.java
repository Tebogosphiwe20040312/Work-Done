package vut;

/**
 *
 *
 * @author 222467088 TS Jiyane
 */

public abstract class Gamer implements Registerable {

    private String id;
    private String name;
    private int age;
    private String code;

    public Gamer() {
    }

    public Gamer(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public abstract String genCode();

    @Override
    public abstract int calculateDiscount(int fee);
}
