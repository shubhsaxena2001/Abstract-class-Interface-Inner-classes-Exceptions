package banking;

public class Tester {
    public static void main(String[] args){
        Bank B1 = new BankA();
        System.out.println("The balance of bank B1 is "+ B1.getBalance());

        Bank B2 = new BankB();
        System.out.println("The balance of bank B2 is "+ B2.getBalance());

        Bank B3 = new BankC();
        System.out.println("The balance of bank B3 is "+ B3.getBalance());
    }
}
