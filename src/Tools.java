import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tools extends bank implements Serializable {

//    static ObjectOutputStream oos = null;
//    static ObjectInputStream ois = null;
    static ArrayList<bank> Bank = new ArrayList<>();
    public static int login(bank b[] , int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Id ");
        String id = sc.next();
        System.out.println("enter the PASSword");
        String Pass = sc.next();
        for (int i = 0; i < n; i++) {
            if (b[i].ID.equals(id) && b[i].pass.equals(Pass)){
                System.out.println("Login successful...");
                return i;
            }
        }
        System.out.println("Invalid Credentials !!");
        return  -1;
    }
//    public static void savefile(bank b[] ,int n){
//        for (int i = 0; i < n; i++) {
//            Bank.add(b[i]);
//        }
//    }
//    static public void openfile(){
//        try {
//            ois = new ObjectInputStream(new FileInputStream("Transection.txt"));
//            Bank = (ArrayList<bank>) ois.readObject();
//            ois.close();
//        }catch(Exception e){e.printStackTrace();
//        }
//    }
//    static public int open(bank b[] ,int n ){
//        int num = 0;
//        int i;
//        for (i = n; i < Bank.size()+n; num++, i++) {
//            b[i] = Bank.get(num);
//            num++;
//        }
//        return i;
//    }
//    public static void closefile(){
//        try {
//            oos = new ObjectOutputStream (new FileOutputStream("Transection.txt"));
//            oos.writeObject(Bank);
//            oos.close();
//            System.out.println("saved succesfully");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//
//    }

    public static void bank_opr(bank b[] ,int n){
        if (n == -1){
            System.out.println("try again...");
            return;
        }
         Scanner sc = new Scanner(System.in);
        int ch = 1;
        while (ch!=0){
            System.out.println("enter your choice ");
            System.out.println("1. deposit money \n2. Withdraw \n3. check balance \n4. Display Account info. \n5.edit account info \n0 for exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:{
                    b[n].deposit();
                    break;
                }
                case 2:{
                    b[n].withdraw();
                    break;
                }
                case 3:{
                    b[n].check();
                    break;
                }
                case 4:{
                    b[n].status();
                    break;
                }
                case 5:{
                    b[n].edit(b , n);
                    break;
                }
                case 0:{
                    b[n].limit = 40000;
                    break;
                }
            }
        }

    }
}
