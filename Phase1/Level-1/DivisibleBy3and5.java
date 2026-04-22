import java.util.*;
import java.util.Scanner;
public class DivisibleBy3and5{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter to check it is divisible by 3 and 5 or not");
int number = sc.nextInt();
if(number%5==0 && number%3==0){

    System.out.println(" Number is divisible by 5  and 3");
}
else{
     System.out.println("Number is not  divisible by 5 and 3" );
}




}





}