package Lesson2;

public class Bank {
    private int money = 0;

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // public int showMyMoney() {
    //     int myMoney = this.money;
    //     return myMoney;
    // }
    
    public int atmShowMyMoney(String account, String password) {
        int myMoney = 0;
        if(account == "edward071123" && password == "123123") {
            myMoney = this.money;
        } else {
            myMoney = -1;
        }

        return myMoney;
    }

    public void saveMoney(String account, String password, int money) {
        if(account == "edward071123" && password == "123123") {
            this.money = money;
            System.out.println("錢已順利存入");
        } else {
            System.out.println("帳密錯誤");
        }

    }

}
