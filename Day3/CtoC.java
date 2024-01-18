package Day3;
class Metric{
    int km;
    int m;
    Metric(int k,int meter){
        km = k;
        m = meter;
    }
}

class Impereal{
    int mile;
    int foot;    
    Impereal(int m,int f){
        mile = m;
        foot = f;
    }
    Impereal(Metric m){
        mile = (m.km/(int)1.6);
        foot = (m.m/(int)3.2);
    }
}

public class CtoC {
    public static void main(String[] args) {
        Metric m = new Metric(10, 1);
        Impereal i = new Impereal(10,1);
        System.out.println("the value of impereal obj is "+ i.mile +", " + i.foot);
        i = new Impereal(m);
        System.out.println("the value of impereal obj now is "+ i.mile +", " + i.foot);
        // m = new Metric(i);
        System.out.println("the value of metric obj is " + m.km +" , "+m.m);
    }
}
