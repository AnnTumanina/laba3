package com.company;

public class Main {
    public static void main(String[] args){
        for(int i = 1; i < 11; i++){
            for(int k = 1; k < 11; k++){
                int result;
                result = i * k;
                System.out.println(i + "×"+ k + "=" + result);
            }
            System.out.println("");
        }
    }
}
