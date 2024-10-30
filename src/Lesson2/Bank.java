package Lesson2;

public class Bank {
    // 情境: 這邊是你存入銀行的金額, 為了安全起見只能在銀行內才有讀寫
    private int money = 0;

    // 情境: 帳號密碼錯誤輸入次數
    private int errorCount = 0;

    // 情境: 必須透過臨櫃或是ATM核實身份後才能查看餘額, 所以必須帶入帳號密碼
    public void getMoney(String account, String password) {
        // 輸入錯誤超過3次就需要鎖卡
        if (this.errorCount >= 3) {
            System.out.println("查詢餘額時, 您的輸入超過3次已經被封鎖, 請洽銀行人員進行處理");
        } else {
            // 輸入錯誤未超過3次, 進行帳密比對
            if(account == "edward071123" && password == "123123") {
                System.out.println("您的餘額: " + this.money);
            } else {
                // 錯誤輸入次數+1
                this.errorCount++;

                System.out.println("查詢餘額時, 帳密錯誤");
            }
        }

    }

    // 情境: 必須透過臨櫃或是ATM核實身份後才能存錢, 所以必須帶入帳號密碼
    public void setMoney(String account, String password, int money) {
        // 輸入錯誤超過3次就需要鎖卡
        if (this.errorCount >= 3) {
            System.out.println("存錢時, 您的輸入超過3次已經被封鎖, 請洽銀行人員進行處理");
        } else {
            // 輸入錯誤未超過3次, 進行帳密比對
            if(account == "edward071123" && password == "123123") {
                this.money += money;
                System.out.println("錢已順利存入");
            } else {
                // 錯誤輸入次數+1
                this.errorCount++;

                System.out.println("存錢時, 帳密錯誤");
            }
        }
        
    }

}
