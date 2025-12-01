public class Temp2 {

    int i;

    Temp2(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return i + "";
    }

    @Override
    public int hashCode() {
       
        return i;
    }

}
