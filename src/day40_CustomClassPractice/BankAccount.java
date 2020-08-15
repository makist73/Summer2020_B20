package day40_CustomClassPractice;
/*
task:
    BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance

 */
public class BankAccount {

    String accountType;
    String accountHolder;
    String accountNumber;
    Double balance;

    public void setAccountInfo(String clientAccountType,String name, String acctNum){ // sets the info

    }
}
