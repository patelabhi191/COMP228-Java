package Assignment;

public class BankAccount {

        private String name;
        private int anumber;
        private double balance;

        //Getter n Setter for name
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        //Setter for balance..
        //No getter possible as balance cannot be set by user or bank.
        public double getBalance() {
            return balance;
        }
        //Account number setter and getter
        public int getAnumber() {
            return anumber;
        }
        public void setAnumber(int anumber) {
            this.anumber = anumber;
        }

        //Constructor for assigning values
        public BankAccount(String name, double balance) {
            this.name = name;
         //Money in bank can't be negative
            if(balance>0) {
                this.balance = balance;
            }
        }

        //Method to deposit money
        public void deposit(double amount){
            this.balance += (amount>0)?amount:0;
        }

        //Method to withdraw money
        public void withdraw(double amount){
            this.balance -= (amount<=0)?0:amount;
        }
}
