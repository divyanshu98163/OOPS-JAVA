public class Oops7 {
    public static void main(String[] args) {
        dog dobby = new dog();
        dobby.leg =4;
        dobby.eat();
        System.out.println(dobby.leg);
        

    }
    
}
// base class 
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class mammel extends Animal{
    int leg;
}

class dog extends mammel{
    int breed;
}