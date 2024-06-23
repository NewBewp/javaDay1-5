package bai2;
//2.Write program to print each letter twice
//Original String: hello
//Output String: hheelllloo
public class bai2 {
    public static void main(String[] args) {
//        printTwice();
        printTwice2();
    }
    public static void printTwice(){
        String input = "hello";
        char[] inputArray= input.toCharArray();

        for (char i: inputArray){
            System.out.print(i);
            System.out.print(i);
        }
    }

    public static void printTwice2(){
        String input = "hello";
        StringBuilder stringBuilder = new StringBuilder();

        for( char i: input.toCharArray()){
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());

    }
}
