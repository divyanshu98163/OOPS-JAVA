public class Oops6 {
    public static void main(String[] args) {
        Fish sark = new Fish();
        sark.breathe();
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


    // derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim");
    }
}