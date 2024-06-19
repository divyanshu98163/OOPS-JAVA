public class Oops3{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setcolor("red");
        System.out.println(p1.getColor());
        p1.SetTip(5);
        System.out.println(p1.getTip());
        p1.Setcolor("yellow");
        System.out.println(p1.getColor());
    }
}
class Pen{
private String Color;
private int Tip;

String getColor(){
    return this.Color;
}

int getTip(){
    return this.Tip;
}
void Setcolor(String newColor){
    Color = newColor;
}

void SetTip(int Tip){
    Tip = this.Tip;
}
}
