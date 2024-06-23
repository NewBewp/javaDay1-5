package bai3;

public class bai3 {
    public static void main(String[] args) {
        int[] inputArr = {1,2,3,4,5,6,7,8,9};
        selectNumber(inputArr);
    }
    static void selectNumber(int[] inputArr){
        int even = 0;
        int odd = 0;

        for (int i: inputArr){
            if(i%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("So phan tu chan: "+even);
        System.out.println("So phan tu le: "+odd);
    }
}
