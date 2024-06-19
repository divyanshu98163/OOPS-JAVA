public class Oops5 {
    
    public static void main(String[] args) {
        Student s1 = new Student("Divyanshu", 3);
        s1.password ="abcd";
        System.err.println("original constuctor:-"+s1.Name+"\n"+s1.password+"\n"+s1.roll+"\n");

        Student s2 = new Student(s1);
        s2.Name ="Divyanshu Singh";
        s2.password ="xyz";
        s2.roll = 3;
        System.out.print("Copy constuctor:- "+s2.Name+"\n"+s2.password+"\n"+s2.roll);
    }
}
class Student{
    String  Name;
    int roll;
    String password;

    Student(String Name, int roll) {
        this.Name = Name;
        this.roll = roll;
        String password;
    }
        //copy consturutor

    Student(Student s1) {
        this.Name= Name;
        String password;
    }

    

    

}