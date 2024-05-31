package com.example;

public class Main2{
    public static void main(String args[]){

        int a,b,c;
        a=5;
        b=10;
        c=sum(a,b);
        System.out.println("c is"+c);
        String name="vibhas";
        greetMethod(name);
    }
        public static void greetMethod(String name1){
            System.out.println("Hello"+name1);
        }
    
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
