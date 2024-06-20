public class Hierarchial {
    public static void main(String arg[]){
        Fish Sark = new Fish();
        Sark.eat();
        Mammel dog = new Mammel();
        dog.breathe();
        Bird parrot = new Bird();
        parrot.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammel extends Animal{
    void Walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void Swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
