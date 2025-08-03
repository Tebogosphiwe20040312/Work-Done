package vut.data;

/**
 *
 * @author 222467088 TS Jiyane
 */
public class StudentClass {

    private String stdno;
    private String stuname;
    private String gender;
    private String subjcode;
    private int marks;

    public StudentClass(String stdno, String stuname, String gender, String subjcode, int marks) {
        setStdno(stdno);
        setStuname(stuname);
        setGender(gender);
        setSubjcode(subjcode);
        setMarks(marks);
    }

    public String getStdno() {
        return stdno;
    }

    public void setStdno(String stdno) {
        this.stdno = stdno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubjcode() {
        return subjcode;
    }

    public void setSubjcode(String subjcode) {
        this.subjcode = subjcode;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {

        return stdno + "\t" + stuname + "\t" + subjcode + "\t" + marks + "\n";
    }
}
