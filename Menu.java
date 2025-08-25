import java.util.Scanner;

public class Menu {
    static Scanner sc=new Scanner(System.in);
    public void displayMenu(){
        while (true) {
            System.out.println("Please choose an option to continue");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("4. Exit.");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    Balancecheck b1=new Balancecheck();
                    b1.checkBalance();
                    break;
                case 2:
                    Deposit d1=new Deposit();
                    d1.depositMoney();
                    break;
                case 3:
                    Withdraw w1=new Withdraw();
                    w1.withdrawMoney();
                    break;
                case 4:
				    System.out.println("Thank you for choosing Naveen's ATM. Goodbye!");
				    System.exit(0);
				    break;
            }

        }
    }
}
