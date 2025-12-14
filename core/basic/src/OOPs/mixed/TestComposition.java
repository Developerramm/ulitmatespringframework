package OOPs.mixed;

class College{

    private String collName;
    private int estYear;
    private final Department dept;

    public College(String collName,int estYear,String depName,String hodName){
        this.collName = collName;
        this.estYear = estYear;
        dept = new Department(depName, hodName);
    }

    private class Department{

        private String depName;
        private String hodName;

        public Department(String depName,String hodName){
            this.depName = depName;
            this.hodName = hodName;
        }

        @Override
        public String toString() {
            return "Department [depName=" + depName + ", hodName=" + hodName + "]";
        }

    }

    @Override
    public String toString() {
        return "College [collName=" + collName + ", estYear=" + estYear + ", dept=" + dept + "]";
    }
}

public class TestComposition {
    public static void main(String[] args) {
        College coll = new College("IIT Delhi", 1945, "CSE", "Mr Kumar");
        System.out.println(coll);
    }

}
