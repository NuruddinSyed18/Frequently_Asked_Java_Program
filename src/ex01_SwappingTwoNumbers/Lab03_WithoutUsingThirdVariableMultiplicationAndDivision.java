package ex01_SwappingTwoNumbers;

public class Lab03_WithoutUsingThirdVariableMultiplicationAndDivision {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Before Swapping of two numbers"+a+"  "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After Swapping of two numbers"+a+"  "+b);
    }
}
