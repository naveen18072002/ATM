import java.util.Scanner;

public class Pin {
    static Scanner sc=new Scanner(System.in);
    public void enterPin(){
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter your Four digit pin to continue:");
            int pinNo=sc.nextInt();
            if (pinNo==1234) {
                System.out.println("Wait.... Your card details are loaded...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            else{
                System.out.println("Access denied!!!");
                if (i==1) {
                    System.out.println("You have 2 more chances left!");

                }
                else if (i==2) {
                    System.out.println("You have 1 more chance to left!!");
                }
                else{
                    System.out.println("Sorry! You have exhausted your choices of entering PIN.");
			        System.exit(0);
                }
            }
        }
    }
}
