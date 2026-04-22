import java.util.*;
import java.util.Scanner;
public class CheckTemp{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter tempreture to check hot cold or warm");
int temp = sc.nextInt();
if(temp<16){
System.out.println("Cold");
}
else if(temp>=16 && temp<=40){

    System.out.println("warm");
}
else{
    System.out.println("hott");
}



}





}