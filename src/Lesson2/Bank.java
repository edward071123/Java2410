package Lesson2;

public class Bank {
    public int money;
    
    public int showMyMoney(String account, String password) {
        int myMoney = 0;
        if(account == "edward071123" && password == "123123") {
            myMoney = this.money;
        }

        return myMoney;
    }
}
