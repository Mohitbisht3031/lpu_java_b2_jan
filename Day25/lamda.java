package Day25;
@FunctionalInterface
interface Increment{
    int incre(int x);
}

public class lamda implements Runnable{
    public void run(){
        System.out.println("RRT");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new lamda());
        t.start();
        System.out.println("MT");
    }
}

// public class lamda extends Thread{
//     public void run(){
//         System.out.println("RT");
//     }
//     public static void main(String[] args) {
//         Thread t = new Thread(new lamda());
//         t.start();
//         System.out.println("MT");
//         // Increment obj = (int x) -> x+1;
//         // System.out.println(obj.incre(10));
//     }
// }
