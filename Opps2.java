

public class Opps2 {
    public static void main(String args[]){
        BankAccount myAc = new BankAccount();
        myAc.username ="Divyanshu";
        System.out.println(myAc.username);
        myAc.Setpassword("yguguy");
        
    }

}
class BankAccount{
    public String username;
    private String Password;
    public void Setpassword(String pwd){
        Password = pwd;
    }

}
