import java.util.*;
import java.util.Scanner;
public class Printposnegzer{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter the number for check it is positive or negative");
int number = sc.nextInt();
if(number>0){

    System.out.println("Positive Number");
}
else if(number<0){
     System.out.println("Negative Number");
}
else{
    System.out.println("zero Number");
}



}





}