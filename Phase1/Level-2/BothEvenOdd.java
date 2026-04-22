import java.util.*;
import java.util.Scanner;
public class BothEvenOdd{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter first number");
int number1= sc.nextInt();
System.out.println("please enter second number");
int number2 = sc.nextInt();

if(number1%2==0 && number2%2==0){
    System.out.println("both number is even");
}
else if(number1%2!=0 && number2%2!=0){

    System.out.println("Both Number is odd");
}
else{
    System.out.println("one number is even and one number is odd");
}




}




}





