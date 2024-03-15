package Day24;

@FunctionalInterface
interface loan{
    int salary = 100000;
    double homeLoan(int x);
    // int studyLoan(int x);
}

// class midClass implements loan{
//     public int homeLoan(int x){
//         if(x >= salary)return 10000;
//         return -1;
//     }
// }

public class abstraction{
    // public void run(){
    //     System.out.println("inside runnable run");
    // }
    public static void main(String[] args) {
        // Runnable obj = () -> System.out.println("inside runnable run");
        Thread t= new Thread(() -> {
            System.out.println("mehtod of thread");
        });
        t.start();
        System.out.println("Main thread");
        // loan l = (int x) -> (double)x*0.1;
        // double ans = l.homeLoan(1000000);
        // System.out.println("EMI for the homeloan is "+ ans);
    }
}
