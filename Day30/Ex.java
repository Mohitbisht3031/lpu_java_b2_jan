package Day30;

public class Ex{
    int div(int v1,int v2){
        return v1/v2;
    }
    public static void main(String[] args) {
        int v = 0;
        Ex obj = new Ex();
        try{
            obj.div(1,v);
        }catch (ArithmeticException ex){
            System.out.println("AME "+ex);
        }catch (Exception ex){
            // System.out.println(ex.getStackTrace());
            // ex.printStackTrace();
            System.out.println("Genernal ex "+ex);
        }
    }
}