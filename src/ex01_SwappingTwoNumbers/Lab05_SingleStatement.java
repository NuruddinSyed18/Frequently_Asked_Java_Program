package ex01_SwappingTwoNumbers;

public class Lab05_SingleStatement {
    public static void main(String[] args){
        int a=10, b=20;
        System.out.println("Before swapping of two numbers...."+a+"   "+b);
        b=(a+b)-(a=b);
        System.out.println("After swapping of two numbers...."+a+"   "+b);
    }
}
