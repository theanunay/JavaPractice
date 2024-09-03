class Animal {
    public static void display(){
        System.out.println("Static or class method from Base");
    }
    public void print(){
        System.out.println("Instance from Base.");
    }
}
class Derived extends Animal{
    public static void display(){
        System.out.println("Static method from Derived.");
    }
    public void print(){
        System.out.println("Instance from Derived");
    }
}

public class Test{
    public static void main(String[] args) {
        Animal ob1 = new Derived();
        // It will call Base class's method.
        ob1.display();
        ob1.print();
    }
}
