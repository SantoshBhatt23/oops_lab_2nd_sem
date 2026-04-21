package ques7;

public class BankSystem {
    static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        Thread father = new Thread(new FatherThread(sharedAccount));
        Thread son = new Thread(new SonThread(sharedAccount));

        System.out.println("Initial Balance: Rs. 600\n");
        father.start();
        son.start();
    }
}
