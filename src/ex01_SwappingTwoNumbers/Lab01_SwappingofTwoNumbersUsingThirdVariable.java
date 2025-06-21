package ex01_SwappingTwoNumbers;

public class Lab01_SwappingofTwoNumbersUsingThirdVariable {
    public static void main(String[] args){
        int a=10, b=20;
        System.out.println("Before Swapping of two numbers..."+a+"  "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("After swappping of two numbers..."+a+"  "+b);
    }
}
