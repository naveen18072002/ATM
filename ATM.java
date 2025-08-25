public class ATM {
    public static int balanceAmount=100000;
    public static void main(String[] args) {
        System.out.println("Welcome to our Naveen's bank\n\n");
        System.out.println("Please insert your card to continue...");
        Pin pin=new Pin();
        pin.enterPin();
        Menu menu=new Menu();
        menu.displayMenu();
        
    }
}
