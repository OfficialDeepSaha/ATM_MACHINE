import java.util.Scanner;

class ATM{

    float Balance;

    int PIN = 1234;

    public void  input(){

        System.out.print("Enter Your Pin:- ");
        Scanner inputPIN  = new Scanner(System.in);
       int pin= inputPIN.nextInt();
       if (pin==PIN){
           menu();

       } else {
           System.out.println("Enter a Valid pin");
           input();
       }
    }

    private void menu() {
        System.out.println("1.Check Balance" );
        System.out.println("2.Withdraw Balance" );
        System.out.println("3.Deposit Balance");
        System.out.println("4.Exit");

        Scanner inputMenu = new Scanner(System.in);
        int i =  inputMenu.nextInt();

        if (i==1){

       float balance =    Balance;
       System.out.println("Your Account Balance:- " + balance);
       menu();

        } else if (i==2) {

            System.out.print("Enter Your Amount to Withdraw:- ");
            Scanner w  = new Scanner(System.in);
            float amount = w.nextFloat();

            if (Balance== 0.0 || amount > Balance) {

                System.out.println("Insufficient Balance");
                menu();
            }
          else {
                float balance = Balance - amount;
                Balance = balance;

                System.out.println("Withdraw Successfull!");
                menu();

            }


        } else if (i==3) {

            System.out.print("Enter Amount to Deposit:- ");
            Scanner d= new Scanner(System.in);
           float depositBalance =  d.nextFloat();

           Balance = depositBalance;

           System.out.println("Deposit Successful!");

           menu();

        }


else if (i==4) {

    return;


        }
    }


}

public  class ATM_MACHINE {


    public  static void main(String[] args) {

    ATM s = new ATM();
      s.input();

    }
}