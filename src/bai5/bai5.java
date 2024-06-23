package bai5;
//5. Viết chuong trinh de doi cho hai chuoi ma khong su dung bien thu 3
//input str1: hello
//input str2: world
//
//output str1: wolrd
//output str2: hello

public class bai5 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        switchStringStr1(str1, str2);
    }

    public static void switchStringStr1(String str1, String str2){
        str1 = str1+str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println(str1);
        System.out.println(str2);
    }

}
