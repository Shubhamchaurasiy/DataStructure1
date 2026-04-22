import java.util.*;
import java.util.Scanner;
public class CheckMultiple{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter first number");
int number1= sc.nextInt();
System.out.println("please enter second number");
int number2 = sc.nextInt();
if((number1%number2==0) ||(number2%number1==0)){
      if(number1>number2){
        System.out.println("number" + number1 +"   is multiple of number "+number2);
      }
      else{
        System.out.println("number" + number2 +"   is multiple of number "+number1);
      }
}else{



    System.out.println("this  is not multiple od any");
}

}




}





