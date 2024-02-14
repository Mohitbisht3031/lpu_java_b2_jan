package Day13;

// parent class of all the class or objects that are there in java
// 

class Person{
    public String name;
    private int age;
    protected char sex;    

    // default
    public Person(){
        System.out.println("default const.");
    }

    //parameterize const
    public Person(String n ,int a,char s){
        System.out.println("paramterize const");
    }

    int getterAge(){
        return age;
    }

    void setAge(int a){
        age = a;
    }

    // public String toString(){
    //     return name+" " +age+" "+sex;   
    // }
}


public class C {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Mohit";
        p.sex = 'M';
        p.setAge(20);
        System.out.println("hey buddy my name is "+p.name + " my age is "+p.getterAge()+" my sex is "+p.sex);
    }
}
