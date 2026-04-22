import java.util.*;
import java.util.Scanner;
public class PrintLarger3{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter first Number");
int number1 = sc.nextInt();
System.out.println("please enter second number");
int number2 = sc.nextInt();
System.out.println("please enter third number");
int number3 = sc.nextInt();
if(number1>number2 && number1>number3){

    System.out.println(number1 +"is larger");
}
else if(number2>number1 && number2>number3){
     System.out.println(number2 +"is larger");
}
else{
    System.out.println(number3 +"is larger");
}




}





}