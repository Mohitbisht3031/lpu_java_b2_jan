public class Ex {
    public static void main(String[] args) {
        try{
            int x = 1/0;
        }catch (Exception e){
            System.out.println(e);
            // return;
            System.exit(0);
        }finally {
            System.out.println("finally block");
        }
        System.out.println("in main scope");
    }   
}
