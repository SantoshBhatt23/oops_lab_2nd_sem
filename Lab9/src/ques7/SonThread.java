package ques7;

class SonThread implements Runnable {
    BankAccount account;

    SonThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            account.withdraw();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
