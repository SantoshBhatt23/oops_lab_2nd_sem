package ques7;

class FatherThread implements Runnable {
    BankAccount account;

    FatherThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            account.deposit();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
