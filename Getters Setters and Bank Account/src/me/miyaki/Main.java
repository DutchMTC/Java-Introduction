package me.miyaki;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        class BankAccount{
            String accountNumber;
            long balance;
            String firstName;
            String lastName;
            String address;
            int age;

            public String getAccountNumber() {
                return accountNumber;
            }

            public void setAccountNumber(String accountNumber) {
                this.accountNumber = accountNumber;
            }

            public long getBalance() {
                return balance;
            }

            public void setBalance(long balance) {
                this.balance = balance;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String userName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String userLastName) {
                this.lastName = lastName;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void deductMoney(long amount){
                balance = balance - amount;
            }

            public void addMoney(long amount){
                balance = balance + amount;
            }

            public BankAccount(String accountNumber, long balance, String firstName, String lastName, String address, int age) {
                this.accountNumber = accountNumber;
                this.balance = balance;
                this.firstName = firstName;
                this.lastName = lastName;
                this.address = address;
                this.age = age;
            }
        }

        BankAccount larrysAccount = new BankAccount("123456789", 69420, "Larry", "Pickleson", "123 New York Street", 99);
        System.out.println(larrysAccount.getAccountNumber());

        // Add 600$ and take away 400$
        larrysAccount.addMoney(600);
        larrysAccount.deductMoney(400);
        System.out.println(larrysAccount.getBalance());

    }
}
