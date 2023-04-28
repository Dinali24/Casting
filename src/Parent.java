public class Parent {
    String name;
    void display(){
        System.out.println("Super Class Is Running!!");
    }
}
class Chid extends Parent{
    int age;

    @Override
    void display() {
        System.out.println(" Sub class is Running!!");
    }
}

class Downcasting{
    public static void main(String[] args) {
        Parent p  =new Chid(); //upcasting
        p.name = "Dinali";
        Chid c =(Chid) p; //downcasting
        c.age = 27;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();

    }
}

