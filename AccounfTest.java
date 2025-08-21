public class AccounfTest {
    public static void main(String[] args) {
         SavingsAccount account1 = new SavingsAccount();
        account1.name = "Hanel";
        account1.balance = 1000;
        account1.deposit (1000);
       
        SavingsAccount account2 = new SavingsAccount();
        account2.name = "Iyunso";
        account2.balance = 9000.;
        account2.deposit(2000);

        SavingsAccount account3 = new SavingsAccount();
        account3.name = "Negaso";
        account3.balance = 5000.0;
        account3.deposit(3000);


        account1.displayCustomer();
        account2.displayCustomer();
        account3.displayCustomer();  
        account3.withdraw( 1000);
    }//end method main
}
