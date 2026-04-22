import java.util.*;
import java.util.Scanner;
public class Leapyear{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter to check it given Nu0mber leap year or not");
int number = sc.nextInt();
if((number%4==0 && number%100!=0) || (number%400==0)){

    System.out.println("leap year");
}
else{
     System.out.println("Not leap year" );
}




}





}