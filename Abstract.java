public class Abstract {
    public static void main(String[] args) {
        Mustang myHourse = new Mustang();
    }
}
abstract class Animal{

    Animal(){
        System.out.println("Animal constructor called ");
    }
    
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}

class Hourse extends Animal{

    Hourse() {
        System.out.println("Hourse constructer called");
    }
    
    void walk(){
        System.out.println("Walk in 4 leg");
    }
}

class Mustang extends Hourse{

    Mustang() {
        System.out.println("Mustag construtor called");

    }
    void walk(){
        System.err.println("Walk");
    }
    

}