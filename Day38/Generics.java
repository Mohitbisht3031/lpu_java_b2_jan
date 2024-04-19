package Day38;

class M<E,V>{
    E a;
    V b;

    M(E a,V b){
        this.a  = a;
        this.b = b;
    }

    void print(){
        System.out.println("val of a "+ a +" value of b is" + b);
    }
}

public class Generics {
    public static void main(String[] args) {
        M<String,String> obj = new M("Mohit","Bisht");
        M<Integer,Double> obj2 = new M(1,2.343);
        obj.print();;
        obj2.print();
    }
}
