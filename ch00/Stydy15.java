package ch00;

import javax.management.RuntimeErrorException;

class 계좌 {
    private String accountNumber;
    private String owner;
    private String password;
    private long money;

    public 계좌(String accountNumber, String owner, String password, long money) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.password = password;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public long getMoney(String password) {
        if(this.password.equals(password)){
            return money;
        }else {
            throw new RuntimeException();
        }

    }

    public void addMoney(long money) {
        this.money = this.money + money;
    }
    
    public void minusMony(long money, String password) {
        if(this.password.equals(password)){
            this.money = this.money - money;
        } else {
            throw new RuntimeException();
        }
    }

}

public class Stydy15 {
    public static void main(String[] args) {
       계좌 account = new 계좌("ASDF", "김두한", "1972", 10000);

       long money = account.getMoney("1972");
       
       System.out.println(money);


    }    
}
