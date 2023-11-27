import java.io.Serializable;
import java.math.BigInteger;
import java.util.Scanner;

public class person implements Serializable {
    private String  name,address ,DOB, email_id;
    private int age ;
    Scanner sc1 = new Scanner(System.in);
     Scanner sc = new Scanner(System.in);
    private BigInteger mob_num , adhar;
    protected void get(){

        try{
            System.out.println("enter name ");
            name = sc.nextLine();
            System.out.println("enter address");
            address = sc.nextLine();
            System.out.println("enter DOB");
            DOB = sc.next();
            System.out.println("enter email address");
            email_id = sc.next();
            System.out.println("enter age ");
            age = sc.nextInt();
            System.out.println("enter mobile number");
            mob_num = sc.nextBigInteger();
            System.out.println("enter Adhar number ");
            adhar = sc.nextBigInteger();
        }catch (Exception e){
            System.out.println("invalid");
            get();
        }
    }
    protected void display(){
        System.out.println("name : "+this.name + "\nage : "+this.age +"\naddress : "+this.address+"\nmobile number : "+mob_num+"\nDOB :"+DOB);
        System.out.println("email id : "+email_id+"\nAadhar number : "+adhar+"\n");
    }

    protected void setName() {
        System.out.println("enter name");
        this.name = sc1.nextLine();
    }

    protected void setAddress() {
        System.out.println("enter address");
        this.address = sc1.nextLine();
    }

    protected void setDOB() {
        System.out.println("enter DOB");
        this.DOB = sc1.nextLine();
    }

    protected void setEmail_id() {
        System.out.println("enter address");
        this.email_id = sc1.nextLine();
    }

    protected void setAge() {
        System.out.println("enter age");
        this.age = sc1.nextInt();
    }

    protected void setMob_num() {
        System.out.println("enter mobile number");
        this.mob_num = sc1.nextBigInteger();
    }

    protected void setAdhar() {
        System.out.println("enter Aadhaar number");
        this.adhar = sc1.nextBigInteger();
    }
}