//atm program for 5 transactions
import java.util.*;

class atm{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        double balance = 5000;
        int transaction=5;

        for(int i=1;i<=transaction;i++){
            System.out.println("\nATM Option:");
            System.out.println("1.Withdraw\n2.Deposite\n3.Check Balance\n4.Exit");
            int choice=s.nextInt();
            if(i==5){
                System.out.println("This Was Your Last Transaction");
                System.out.println("Come Tomorrow");
            }
            switch(choice){
                case 1:
                    System.out.println("Enter Amount To Withdraw:");
                    int amount=s.nextInt();
                    if(amount<=balance){
                        balance-=amount;
                        System.out.println("Withdrawal Successfully \nCurrent Amount:"+balance);
                    }
                    else{
                        System.out.println("Insuffiient Balance \nCurrent Amount:"+balance);
                    }
                    break;

                case 2:
                    System.out.println("Enter Amount To Deposite:");
                    int dep_amount=s.nextInt();
                    balance+=dep_amount;
                    System.out.println("Amount Added Successfully\nCurrent Balance:"+balance);
                    break;

                case 3:
                    System.out.println("Total Amount is:"+balance);
                    break;

                case 4:
                    System.out.println("Thankyou For Visit!!");
                    return;

                default:
                    System.out.println("*Select Correct Option!!");
                    break;
            }
        }
    }
}