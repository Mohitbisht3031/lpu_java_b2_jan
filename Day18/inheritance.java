package Day18;

class A{
    int a;
    // A(){
    //     System.out.println("DCA");
    // }
    A(int a){
        System.out.println("PCA");
    }
}

class B extends A{
    // B(){
    //     System.out.println("DCB");
    // }
    B(int a){
        super(a);
        System.out.println("PCB");
        this.a = 20;
    }
}

public class inheritance {
    public static void main(String[] args) {
        B obj = new B(10);
        final int a = 10;
        System.out.println(obj.equals(obj));
    }
}
