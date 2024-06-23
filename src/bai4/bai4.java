package bai4;

import java.util.HashSet;
import java.util.Set;

public class bai4 {
    public static void main(String[] args){
        String input = "characters";
        uniqueWord(input);
//        StringBuilder stringBuilder = new StringBuilder(input);
//        Set <Character> hashSet = new HashSet<Character>();
//
//        for(int i=0; i<stringBuilder.length();i++){
//            hashSet.add(stringBuilder.charAt(i));
//            if(hashSet.add(stringBuilder.charAt(i))){
//                stringBuilder.append(i);
//            }
//        }
//        System.out.println(hashSet);
    }

    public static void uniqueWord(String input){
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> hashSet = new HashSet<Character>();
//        System.out.println(hashSet);
        for (char i: input.toCharArray()){
           if (hashSet.add(i)){
               stringBuilder.append(i);
           }
        }
        System.out.println(stringBuilder);
    }

}
