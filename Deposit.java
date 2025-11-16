import java.util.Scanner;

public class Deposit {
    static Scanner sc=new Scanner(System.in);
    public void depositMoney(){
        System.out.print("Please enter the Amount to Deposit :");
        int depositAmount=sc.nextInt();
        System.out.println("Depositing ₹"+depositAmount);
        if (depositAmount<100 || depositAmount%100!=0) {
            System.out.println("Deposit amount must be at least ₹100 and in multiples of ₹100!");
        }
        if (depositAmount<=20000) {
            ATM.balanceAmount+=depositAmount;
        }
        else{
            System.err.println("Deposit Amount can't be more than 20000 in one transaction!");
            System.err.println("Kindly try with lower amount!");
        }
        System.out.println("Your updated Balance :"+ATM.balanceAmount);
    }
}

