class A{
    int a;
    // A(){
    //     System.out.println("DCA");
    // }
    A(int a){
        System.out.println("PCA");
        this.a  = a;
    }
    void print(){
        System.out.println("hi from parent");
    }
}

class B extends A{
    B(int a){
        super(a);
        System.out.println("PCB");
        // this.a = a;
        super.print();
    }
}

public class revision {
    public static void main(String[] args) {
        B b = new B(10);
    }
}
