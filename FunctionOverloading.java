public class FunctionOverloading {
    public static void main(String[] args) {
        Calculator calu = new Calculator();
        System.out.println("\n"+calu.Sum(4, 5));
        System.out.println("\n"+calu.Sum((float)4.3, (float)5.5));
        System.out.println("\n"+calu.Sum(4.3, 5.5,6.3));
    }
}
class Calculator{
    int Sum(int a,int b){
        return a+b;
    }
    float Sum(float a,float b){
        return a+b;
    }
    double Sum(double a,double b,double c){
        return a+b+c;
    }
}
