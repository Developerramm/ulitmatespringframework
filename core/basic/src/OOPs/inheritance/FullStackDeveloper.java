package OOPs.inheritance;

public class FullStackDeveloper extends FrontEndDeveloper {

    public void mySkills() {
        System.out.println("I am a FullStack Developer");
        super.mySkills();
        System.out.println("I know backend part using  spring , node, mongo express");
    }

}
