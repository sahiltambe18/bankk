import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class opr implements Serializable {
    public static void main(String[] args) {
        int ch = 1;
        int n = 0;
        bank b[] = new bank[20];
        ArrayList<bank> B = new ArrayList<>();
         Scanner sc = new Scanner(System.in);

            while (ch != 0) {
                System.out.println("-----------------------------------------CENTRAL BANK OF INDIA-----------------------------------------");
                System.out.println("1. Create a Account \n2. login into Account \n 0 for exit");
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("enter your choice ");
                ch = sc.nextInt();
                switch (ch) {
                    case 1: {
                        b[n] = new bank();
                        b[n].setup();
                        Tools.bank_opr(b, n);
                        n++;
                        break;
                    }
                    case 2: {
                        int num = Tools.login(b, n);
                        Tools.bank_opr(b, num);
                    }
//                    case 0:{
//                        Tools.savefile(b , n);
//                        Tools.closefile();
//                        break;
//                    }
                }
            }
        }
    }

