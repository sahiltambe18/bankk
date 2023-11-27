import java.io.Serializable;
import java.math.BigInteger;
import java.util.Scanner;

public class bank extends person implements Serializable {
    private int bal ;
    protected int limit = 40000;
    private String IFSC = "CBIN02546";
    private String adress ="1/12 ONE COMPLEX HINJAWADI PHASE 1 PUNE MAHARASHTRA ";
    protected String ID , pass;
    private int acc_no = (int) (Math.random()*1000000000);

    // add branch find age

     Scanner sc = new Scanner(System.in);

    public void deposit(){
        System.out.println("enter amount to deposit ");
        int val = sc.nextInt();
        bal+= val;
        System.out.println("deposit successful...");
    }
    public void withdraw(){
        System.out.println("enter amount to withdraw");
        int val = sc.nextInt();
        if (limit==0){
            System.out.println("daily limit reached!!!");
            return;
        }
        if (val < limit){
            if (val <= bal){
                bal-=val;
                limit-=val;
                System.out.println("remaining balance : "+bal);
                System.out.println("your remaining limit is : "+limit);
            } else {
                System.out.println("you have insuficient balance!!!");
            }
        }
        else {
            System.out.println("amount is greater than limit!!");
        }
    }
    public void check(){
        System.out.println("your balance is : "+bal+"/-");
    }
    public void setup(){
        get();
        System.out.println("Create unique ID ");
        ID = sc.next();
        System.out.println("Create Strong Password");
        pass = sc.next();
    }
    public void status(){
        System.out.println("-------------------------CENTRAL BANK OF INDIA-----------------------------------");
        display();
        System.out.println("IFSC code : "+IFSC);
        System.out.println(adress);
        System.out.println("Account number : "+acc_no);
        System.out.println("current balance :"+bal+"/-");
        System.out.println("---------------------------------------------------------------------------------");
    }

    protected void edit(bank b[]  ,int n){
        int ch = 1;
        try{
            while (ch!=0){
                System.out.println("enter your choice...");
                System.out.println("1.change your name \n2.change Address \n3.change age \n4.change DOB \n5.change email id \n6.change mobile number \n7.change Aadhaar number");
                System.out.println("0 for exit");
                ch = sc.nextInt();
                switch (ch){
                    case 1:{
                        setName();
                        break;
                    }
                    case 2:{
                        setAddress();
                        break;
                    }
                    case 3:{
                        setAge();
                        break;
                    }
                    case 4:{
                        setDOB();
                        break;
                    }
                    case 5:{
                        setEmail_id();
                        break;
                    }
                    case 6:{
                        setMob_num();
                        break;
                    }
                    case 7:{
                        setAdhar();
                        break;
                    }
                }
            }
        }catch (Exception e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("invalid input");
//            edit(b , n);
        }
    }
}
