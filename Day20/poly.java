package Day20;

class Animal{
    void speak(){
        System.out.println("animal speaks");
    }
}

class Dog extends Animal{
    //runtime poly
    @Override
    void speak(){
        System.out.println("dog barks!");
    }
}

public class poly {
    // compile time -> method overloading is the way of achiving it!!
    /* rules
     * 1. different no. param's
     * 2. diff type of param's
     * 3. both
     */
    int max(int a,int b){
        return 1;
    }

    int max(double a,double b){
        return 1;
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        // Dog d = new Animal();
        a.speak();
        // d.speak();        
    }

}
