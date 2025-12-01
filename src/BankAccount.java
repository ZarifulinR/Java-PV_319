public class BankAccount {
    String owner;
    double balance;
    public BankAccount(String owner,double balance){
        if(owner==null){
            System.out.println("IllegalAccessException");
        }
        this.owner=owner;
        this.balance=balance;
    }
    public BankAccount(){

    }

    public double Deposit(double amount){
        if(amount>=0) {
            balance=balance+amount;
        }
        return balance;
    }
    public double Withdraw(double amount){
        if(balance<=0){
            System.out.println("У вас отрицательный баланс! Пополните счет!");
        }
        else {
            balance= balance-amount;
        }
        return balance;
    }
    public void PrintInfo(){
        System.out.println("Имя: " +owner + " Баланс= "+balance);
    }


}
