package Day23;
abstract class HB{
    void deposit(int x){
        System.out.println("deposited "+x+" amount in your account");
    }
    void withdraw(int x){
        System.out.println("deducted "+x+" amount in from account");
    }

    abstract String IFSC();
}

interface loan{
    int Homeloan(int x);
    int studyLoan(int x);
}

interface creditCard{
    String silver(int x);
    String gold(int x);
}

class B1 extends HB implements loan , creditCard{
    String IFSC(){
        return "DELXXX";
    }

    public int Homeloan(int x){
        return 1000000;
    }
    public int studyLoan(int x){
        return 100000;
    }

    public String silver(int x){
        return "YES";
    }
    public String gold(int x){
        return "NO";
    }
}

public class abstraction {
    
}
