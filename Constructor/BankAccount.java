public class BankAccount{

    String name;
    int accountnumber;
    double balance;

    BankAccount(String accName, int accNo, double accBalance){
        name=accName;
        accountnumber= accNo;
        balance= accBalance;
    }

    void displayAccount(){
        System.out.println("Account Holder: "+name);
        System.out.println("Account Number: "+ accountnumber);
        System.out.println("Balance: "+ balance);

    }

    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount("Danish Ansari", 123, 5000);
        myAccount.displayAccount();

        BankAccount myAccount1=new BankAccount("Faiz Ansari", 1234, 50000);
        myAccount1.displayAccount();

        BankAccount myAccount2=new BankAccount("Mobin Khan", 12345, 1000);
        myAccount2.displayAccount();
    }
    
}
