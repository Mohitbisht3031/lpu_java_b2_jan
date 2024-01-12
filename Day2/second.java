package Day2;
class second{
    int a =10;
    public void fun(){
        fun2();
        System.out.println("Just having fun at hasina chawk guyss!!!!" + a);
        return;
    }

    public void fun2(){
        System.out.println("just having alots of fun at lawgate !!!!!"+a);
        fun();
        return;
    }

    public static void main(String[] args) {
        // Integer a = 1234;
        // System.out.println(Integer.rotateLeft(a,2));
        // System.out.println(str);
        // fun();
        // fun2();
        second obj = new second();
        obj.fun();
        obj.fun2();
        obj.a = 50;
        System.out.println("in the main of second calss!!" + obj.a);
    }
}