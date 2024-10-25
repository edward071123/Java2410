package Lesson1;

class Car {
  public String number;
  public String color;
  public boolean isTaix;
  public int year = 0; 
  public static String company = "Taiwan"; // 靜態變數宣告

  // 建構子
  public Car(String number, String color, boolean isTaix, int year) {
      this.number  = number;
      this.color  = color;
      this.isTaix = isTaix;
      this.year   = year;
  }

  public void showCarInfo() {
      System.out.println("Car number:" + this.number +" color is " + this.color);
      System.out.println("Car number:" + this.number +" isTaix " + this.isTaix);
      System.out.println("Car number:" + this.number +" year is " + this.year);
  }

  // 靜態方法印出company(公司名稱)
  public static void showCompanyWithStatic() {
      System.out.println("Car's company is " + company);
  }
}
