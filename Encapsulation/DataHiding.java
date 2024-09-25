package Encapsulation;

public class DataHiding {
    public static void main(String[] args) {
        Bank b = new Bank();
        // System.out.println(b.balance); // Error saying bank.balance is not visible
        System.out.println(b.getBalance());
    }
}

class Bank{
    private int balance =98;
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
}
