public class Practice {
    public static void main(String[] args) {
    //Problems
    /*
        Practice Problems – Encapsulation
        ---------------------------------
        1) BankAccount
        • Private fields: accountNumber (String), balance (double)
        • Provide getters for accountNumber and balance.
        • Provide methods: deposit(amount), withdraw(amount)
            -> Ensure withdraw doesn’t allow balance to go negative.

        2) Employee
        • Private fields: name (String), salary (double)
        • Setters must validate:
            -> name cannot be null or empty.
            -> salary must be >= 0.
        • Provide a method to increase salary by a given percentage.

        3) Car
        • Private fields: brand (String), speed (int)
        • Speed must always be >= 0.
        • Provide methods: accelerate(increment), brake(decrement)
            -> brake should not allow speed below 0.

        4) Product
        • Private fields: productName (String), price (double), quantity (int)
        • Validate:
            -> price must be > 0
            -> quantity must be >= 0
        • Provide methods to add stock and reduce stock safely.

        5) StudentReport
        • Private fields: studentName (String), marks (int)
        • Validate marks between 0 and 100.
        • Provide a method grade() that returns:
            -> "A" for marks >= 75
            -> "B" for marks >= 60
            -> "C" for marks >= 40
            -> "Fail" otherwise.
    */

    //Solutions
    /*
    1) class BankAccount{
        private String accountNumber;
        private double balance;
        BankAccount(String accountNumber, double balance){
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public String getAccountNumber(){
            return accountNumber;
        }
        public double getBalance(){
            return balance;
        }
        public void deposit(double amount){
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount){
            if (amount > 0 && balance >= amount){
                balance -= amount;
            } else {
                System.out.println("Insufficient balance or invalid amount");
            }
        }
    }

    2) class Employee{
        private String name;
        private double salary;
        public void setName(String name){
            if (name != null && !name.isEmpty()){
                this.name = name;
            }
        }
        public void setSalary(double salary){
            if (salary >= 0) {
                this.salary = salary;
            }
        }
        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
        public void increaseSalary(double percent){
            if (percent > 0) {
                salary += salary * (percent / 100);
            }
        }
    }
    */
    }
}
