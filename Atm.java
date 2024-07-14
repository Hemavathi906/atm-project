import java.util.Scanner;

public class Atm{
    public static void main(String[]args){
        int pin=1234;
        int balance=1000;
        int addAmount=0;
        int takeAmount=0;
        int pass;
        String name;
       Scanner scanner=new Scanner(System.in);
        System.out.println("enter your pin");
        pass=scanner.nextInt();
        if(pass==pin){
             System.out.println("enterr your name");
            name=scanner.next();
              System.out.println("welcome"+""+name);
        }
        else{
            System.out.println("this is incorrect pin");

        }  
        while(true){
            System.out.println("press 1 to show your curent balance");
            System.out.println("press 2 to add amount");
            System.out.println("pesss 3 to take amount");
         int opt;
         opt=scanner.nextInt();
         switch (opt){
             case 1:
            System.out.println("current balance" +""+balance);
            break;
            case 2:
                addAmount=scanner.nextInt();
                System.out.println("addAmount" +""+addAmount);
                balance=addAmount+balance;
                break;
            case 3:
                    takeAmount=scanner.nextInt();
                    if(takeAmount>balance){
                        System.out.println("you have only"+ ""+balance);
                   }
                    else{
                    System.out.println("takeAmount"+ ""+takeAmount);
                    balance=takeAmount-balance;
                    }       
                break;
                default:
                    System.out.println("please enter valid option");
         }
        
         } }
        
         
    }
