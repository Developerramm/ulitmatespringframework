package basic;

import java.util.Arrays;

public class Student {

    String sid;
    String sname;
    String saddress;

    Course[] courses;

    public Student(String sid, String sname, String saddress, Course[] courses) {
        this.sid = sid;
        this.sname = sname;
        this.saddress = saddress;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", courses="
                + Arrays.toString(courses) + "]";
    }


}
