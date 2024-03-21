package Day26;

// local inner class
// class OC{
//     private int val = 10;
//     class NC{
//         void print(){
//             System.out.println("the value is "+val);
//         }

//         void setVal(int v){
//             val = v;
//         }
//     }
// }

// static inner class
class OC{
    private static int val = 10;
    static class NC{
        void print(){
            System.out.println("the value is "+val);
        }

        void setVal(int v){
            val = v;
        }
    }
}

public class nested {
    public static void main(String[] args) {
        // for local inner class
        // OC obj = new OC();
        // OC.NC obj2 = obj.new NC();
        // obj2.print();
        // obj2.setVal(20);
        // obj2.print();

        // static inner class
        OC.NC obj = new OC.NC();
        obj.print();
        obj.setVal(20);
        obj.print();
    }
}
