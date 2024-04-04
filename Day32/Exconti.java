import java.io.IOException;

public class Exconti {
    int D(int v) throws KanthEx{
        // if(v == 0)throw new KanthEx("go learn division first!");
        assert v == 0 : "assert msg";
        return 1;        
    }
    public static void main(String[] args) {
        
        try{
        //    int v =  1/0;
            new Exconti().D(0);
        }catch (Exception e){
            System.out.println(e);
        }finally{
            System.out.println("in finally");
        }
        System.out.println("in main");
    }
}
