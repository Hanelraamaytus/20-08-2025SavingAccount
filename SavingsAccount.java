public class SavingsAccount {
        public double balance; 
        public double interestRate = 0.01;
        public String name;
        public double calcInterest(){
         double interest = balance * interestRate / 12;
         return interest;
        }

        public void deposit(int x){
         balance += x;
        }
        public void withdraw (int x){
            if (x <= balance){

            }
            else{
                System.out.printf("Saldo tidak cukup untuk penarikan");
            }
        }
        public void displayCustomer(){
            System.out.println("Customer: "+name);
            System.out.println("Balance: "+balance);
            System.out.println("Rate: "+ interestRate);
        }//end method displasCustomer
    }//end class SavingAccount 



