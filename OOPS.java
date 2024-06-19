public class OOPS{
        public static void main(String[] args) {
            Pen p1 = new Pen();
            p1.Setcolor("red");
            System.out.println(p1.Color);
            p1.SetTip(5);
            System.out.println(p1.Tip);

        }
}
class Pen{
    String Color;
    int Tip;

    void Setcolor(String newColor){
        Color = newColor;
    }

    void SetTip(int newTip){
        Tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percntage;
    void CalcuParcentage(int phy,int chem,int math){
        percntage = (phy+chem+math)/3;
    }
}
