# 在 VSCode 中開始使用 Java
[參考](https://vscode.dev.org.tw/docs/java/java-tutorial)   
[VSCode 安裝Java編碼套件(JDK) - Windows](https://aka.ms/vscode-java-installer-win)   
[VSCode 安裝Java編碼套件(JDK) - macOS](https://aka.ms/vscode-java-installer-mac) 

## 編譯語言 (Compiled language)

一種程式語言的類型，編譯語言在程式執行前會先透過編譯器(compiler)將程式碼編譯(Compile)成計算機所看的懂的機器碼(machine language)，最後再執行。編譯式語言多半會是靜態語言(static language)，它們會事先定義的型別、型別檢查 (type check) 與擁有高效能的執行速度等特性。
代表: C、C++、bjective-C、Visual Basic等等。

## 直譯語言 (Interpreted language)

一種程式語言的類型，不同於編譯語言，直譯語言在執行時會一行一行的動態將程式碼直譯(interpret)為機器碼，並執行。直譯語言多半以動態語言(dynamic language)為主，具有靈活的型別處理，動態生成與程式彈性，但速度會比編譯式語言要慢一些。
代表: JavaScript、Python、Ruby等等。

## 融合 編譯語言 & 直譯語言
為了改善編譯語言以及直譯語言的缺點，因而發展出即時編譯的技術，這種技術混合了編譯語言與直譯語言的優點，如同編譯語言，會先把程式原始碼編譯成中介碼 (Bytecode)。到執行期時，再將中介碼(bytecode，C#為例)直譯，之後執行。使用即時編譯技術的語言會比純編譯語言來的慢一些，但是卻又擁有直譯語言的特性。
代表: Java、C#。

## JVM
Java Virtual Machine

JVM是Java編程語言的核心,當我們執行Java程序時,JVM負責將字節碼轉換為特定於機器的代碼。

JVM 可作為 Java 程式語言和底層硬體之間的解釋器。它為Java應用程式提供在不同平台和作業系統上運作的環境。

## JRE 
Java Runtime Environment (Java的執行環境)

JRE = JVM + JAVA SE API   

如果只是想執行一個java程序,可以只安裝JRE。不需要JDK,因為不需要開發或編譯 Java 源代碼。

## JDK 
Java Development Kit (Java的開發環境) 

JKD = JRE + 工具程式 + Java程式語言   

Java Environment的核心組件,提供編譯、調試和執行Java程序所需的所有工具,可執行文件和二進製文件。


## 編譯指令: 只針對原始檔(.java)產生編譯檔(.class) <需在該專案目錄下執行>
$ `javac App.java` 

## 執行指令: 可直接執行原始檔(.java)或是編譯檔(.class)
### 執行原始碼
$ `java App.java`   

### 執行編譯檔 <需在該專案目錄下執行>
$ `java App`

### 執行編譯檔 <在非專案下執行>(需用 -cp: 啟動 JVM 時告知可執行檔（.class）的位置)
$ `java -cp c:\Java\2410\FirstLesson\bin App`

### 執行jar檔 <需在該專案目錄下執行>
$ `java -jar FirstLesson.jar`

## 打包jar檔
### 前置準備
1. 在專案下(跟bin和src同層)新增MANIFEST.MF檔案
2. 內容如下:   
   ```
   Manifest-Version: 1.0  
   Class-Path: .   
   Created-By: Edward   
   Main-Class: App

   ``` 
3. 注意: MANIFEST.MF需有第五行且為空白行
4. 注意: 需要有編譯檔(.class)
### 打包指令
$ `jar -cvfm App.jar MANIFEST.MF -C bin/ . src/` 


## MarkDown 語法
[參考](https://hackmd.io/@eMP9zQQ0Qt6I8Uqp2Vqy6w/SyiOheL5N/%2FBVqowKshRH246Q7UDyodFA?type=book#%E9%80%A3%E7%B5%90)


## 命名規則
### 套件(Package)的命名原則
```
package lesson2.work.dev
```

### 類別(Class)的命名原則
```
// 主要採 Pascal Case 或 Upper Camel Case 命名法
public class Stringifier {
    // code here
}
```

### 介面(Interface)的命名原則
```
// 以大寫 I 開頭，後續接介面名稱，主要採 Pascal Case 或 Upper Camel Case 命名法
public interface IStringify {
    // method or constant here
}
```

### 常數的命名原則
```
// 類別(class)常數：以大寫字母組成，中間以底線分隔
String ACCEPT           = "Accept";
String ACCEPT_CHARSET   = "Accept-Charset";
String ACCEPT_ENCODING  = "Accept-Encoding";

// 實體(instance)常數：採 Lower Camel Case 命名法
final int maxSize = 100;
final int maxSize = 100;
```

### 成員／屬性(Field)的命名原則
```
// Lower Camel Case 命名法
public class Human {
    String firstName;
    Date birthday;
}

// 以 m 或 _ 開頭的 Pascal Case 命名法
public class Person {
    String mFirstName;
    Date _Birthday;
}
```

### 方法(Method)的命名原則
```
// Lower Camel Case 命名法
public class Tester {

    public boolean addExecution(Execution execution) {
        // code here
    }

    protected void printObject(Object obj){
        // code here
    }

}
```

### 區域變數的命名原則 (命名原則需統一不可混用)
```
// Lower Camel Case 命名法
public static void main(String[] args) {
    int count = 100;
    String serviceUrl = "http://www.somewhere.com/service";
}

// 包含型別的 Pascal Case 命名法
public static void main(String[] args) {
    int intCount = 100;
    String strServiceUrl = "http://www.somewhere.com/service";
}
```

## 型態系統
基本型態（Primitive type）<宣告後可直接使用>  
類別型態（Class type），亦稱參考型態（Reference type） <宣告後還要實體化>

## 基本型態常見
### 整數
可細分為 short 整數（佔 2 個位元組）、int 整數（佔 4 個位元組）與 long 整數（佔 8 個位元組）。不同長度的整數，可儲存的整數範圍也不同。long 整數佔的記憶體長度比int整數來得多，可表示的整數範圍也就比 int 整數大。同樣地，int 整數可表示的整數範圍也比短整數來得大。

### 位元組
byte 型態長度就是一個位元組，在需要逐位元組處理資料時（例如影像處理、編碼處理等），就會使用 byte 型態，若用於表示整數，byte 可表示 -128 到 127 的整數。

### 浮點數
主要用來儲存小數數值，可分為 float 浮點數（佔 4 個位元組）與 double 浮點數（佔 8 個位元組），double 浮點數使用的記憶體空間比 float 浮點數來得多，可表示的精確度也比較大。

### 字元
Java 支援 Unicode，char 型態佔 2 個位元組，可用來儲存 UTF-16 Big Endian 的一個碼元（code unit），就現在而言，只要知道英文或中文字元可以直接寫在 '' 以 char 儲存，也可以把 65535 以內的整數指定給 char。

### 布林
boolean 型態可表示 true 與 false，分別代表邏輯的「真」與「假」，不用在意 boolean 型態的長度。

## 格式化輸出

1.%%：因為 % 符號已被用為控制符號前置，就規定使用 %% 在字串中表示 %。

2.%d：10 進位整數格式輸出，可用於 byte、short、int、long、Byte、Short、Integer、Long、BigInteger。

3.%f：10 進位浮點數格式輸出，可用於 float、double、Float、Double 或 BigDecimal。

4.%e、%E：科學記號浮點數格式輸出，提供的數必須是 float、double、Float、 Double 或 BigDecimal。%e 表示輸出格式遇到字母以小寫表示，如 2.13e+12，%E 表示遇到字母以大寫表示。

5.%o：8 進位整數格式輸出，可用於 byte、short、int、long、Byte、Short、Integer、Long 或 BigInteger。
%x、%X：16 進位整數格式輸出，可用於 byte、short、int、long、Byte、Short、Integer、Long、或 BigInteger。%x 表示字母輸出以小寫表示，%X 則以大寫表示。

6.%s、%S：字串格式符號。
%c、%C：字元符號輸出，提供的數必須是 byte、short、char、Byte、Short、Character 或 Integer。%c 表示字母輸出以小寫表示，%C 則以大寫 表示。

7.%b、%B：輸出 boolean 值，%b 表示輸出結果會是 true 或 false，%B 表示輸出結果會是 TRUE 或 FALSE。非 null 值輸出是 true 或 TRUE，null 值輸出是 false 或 FALSE。

8.%h、%H：使用 Integer.toHexString(arg.hashCode()) 來得到輸出結果，如果 arg 是 null，則輸出 null，也常用於 16 進位格式輸出。

9.%n：輸出平台特定的換行符號，如果 Windows 會置換為 "\r\n"，如果是 Linux 會置換為 '\n'，Mac OS 會置換為 '\r'。

## 物件導向 (Object-oriented programming)

物件導向的方法根據更容易在應用程式中重複使用的現實世界物件來概念化問題的解決方案。

優點:
- 降低了軟體支援成本，主要是由於它是模組化執行的。   
- 透過繼承等功能改進了程式碼重用，從而加快了軟體開發速度。   
- 提高了程式碼的可靠性和靈活性。   
- 由於現實世界的模擬，易於理解。   
- 在物件層級更好的抽象。   
- 降低從一個開發階段過渡到另一個開發階段的複雜性。

特性:
- 封裝（Encapsulation）
- 繼承（Inheritance）
  - 覆寫(Override)
- 多型 (Polymorphism)
- 多載（Overloading)

## 方法(Method)修飾子比較表

| 修飾子 | 同一類別 | 同一套件 | 不同套件的子類別 | 不同套件且非子類別 |
| :-- | --: |:--:| :--:| :--:|
| public  | ● | ● | ● |  |
| protected  | ● | ● | ● |  |
| no modifier  | ● | ● |  |  |
| private  | ● |  |  |  |
