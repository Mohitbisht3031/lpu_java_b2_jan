package Day26;

/*/ implementing the interface
/
interface Square{
    int square(int x);
    int add(int x);
}

public class Anony {
    public static void main(String[] args) {
        Square obj = new Square() {
          public int square(int x){
            return x*x;
          } 
          public int add(int x){
            return x+x;
          }
        };

        System.out.println(obj.square(10));
        System.out.println(obj.add(10));
    }    
}
*/

// AIC with class
/* 
public class Anony {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                System.out.println("threads AIC");
            }
        };
        t.start();
        System.out.println("MT");
    }
}*/

// implemented inside the arg of mehtod or args
public class Anony {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
           public void run(){
                System.out.println("Inside the runnable run!!");
           } 
        });
        t.start();
        System.out.println("MT");
    }
}
