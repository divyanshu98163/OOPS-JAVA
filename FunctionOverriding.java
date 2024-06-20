public class FunctionOverriding {
    public static void main(String args[]){
        Goat G = new Goat();
        G.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eatr anything");
    }
}
class Goat extends Animal{
    void eat(){
        System.out.println("eat grass ");
    }
}
