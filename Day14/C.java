// parent class of all the class or objects that are there in java
// 

class Person_10{
    public String name;
    private int age;
    protected char sex;    
    public int std;

    // initilizer block
    {
        System.out.println("inside initilizer block");
        std = 10;
    }

    // default
    public Person_10(){
        System.out.println("dc");
    }

    //parameterize const
    public Person_10(String name,int age,char sex){
        System.out.println("pc");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    int getterAge(){
        return age;
    }

    void setAge(int a){
        age = a;
    }

    // keep same signature of the method
    // 1. it should have diff no. of args
    // 2. it should have diff type of args
    // both
    int max(int m1,int m2){
        return (m1>=m2 ? m1 : m2);
    }

    int max(int m1,int m2,int m3){
        return (m1 >= m2 ? (m1 >= m3 ? m1 : m3) : (m2 >= m3 ? m2 : m3));
    }

    int max(int m1,int m2,int m3,int m4){
        return max(max(m1,m2,m3),m4);
    }

    int max(int m1,int m2,int m3,int m4,int m5){
        return max(max(m1,m2,m3,m4),m5);
    }
}


public class C {

    public static void main(String[] args) {
        Person_10 p = new Person_10(); //DC
        System.out.println(p.max(1,2)+" "+p.max(1,33,10)+" "+p.max(12,34,45,67)+" "+p.max(1,2,3,4,55));
        
    }
}
