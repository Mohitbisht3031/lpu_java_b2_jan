package Day3;
class Time{
    int t;
    Time(int time){
        t = time;
    }
}

public class PtoC {
    public static void main(String[] args) {
        Time t = new Time(10);
        System.out.println("value of t is " + t.t);      
    }
}
