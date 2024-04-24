
class M<E,V>{
    E a;
    V b;
    M(E a , V b){
        this.a = a;
        this.b = b;
    }

    void print(){
        System.out.println(a+" "+b);
    }
}
public class Generic {
    public static void main(String[] args) {
        M<Integer,Double> obj = new M(10, 20);
    }
}
