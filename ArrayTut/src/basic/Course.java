package basic;

public class Course {

    String cid;
    String cname;
    int ccost;

    Course(String cid, String cname, int ccost){
        this.cid = cid;
        this.cname = cname;
        this.ccost = ccost;
    }

    @Override
    public String toString() {
        return "Course [cid=" + cid + ", cname=" + cname + ", ccost=" + ccost + "]";
    }

    
}
