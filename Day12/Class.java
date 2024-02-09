class Person{
    String name;
    int age;
    char sex;    

    public String toString(){
        return name+" " +age+" "+sex;   
    }
}

public class Class {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Mohit";
        p.age = 12;
        p.sex = 'M';
        System.out.println(p.toString());
        System.out.println(p.hashCode());
    }
}
