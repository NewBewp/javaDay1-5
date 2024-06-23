package bai1;

import java.util.HashSet;
import java.util.Set;

//1.Write function in java for find out sum of distinct elements of array input: {5,1,8,4,9,1,5}
// output: 27
public class bai1 {
    public static void main(String[] args) {
        sumdistinct();
    }

    public static void sumdistinct(){
        int[] arrInput = {5,1,8,4,9,1,5};
        int sum = 0;
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int i: arrInput){
            hashSet.add(i);
        }
        for (int i:hashSet){
            sum +=i;
        }
        System.out.println(sum);

    }
}
