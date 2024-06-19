public class Oops4{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Divyanshu", 03);
        System.out.println(s2.name+"\n"+s2.roll);
        
    }
}
class Student{
    String name;
    int roll;

    Student() {
        System.out.println("Non parameter");
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    

    
}