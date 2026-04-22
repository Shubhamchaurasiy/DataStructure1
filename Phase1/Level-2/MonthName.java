import java.util.*;
import java.util.Scanner;
public class MonthName{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter month number");
int month= sc.nextInt();
if(month>0 && month<=12){
    switch(month){
    case 1:
    case 3:  
    case 5:
    case 7: 
    case 8:
    case 10:
    case 12:
        System.out.println("31");       
        break;  
    case 2:
        System.out.println("28");       
        break;  
    case 4:
    case 6:  
    case 9:
        System.out.println("30");       
        break; 


         

}
}else{

    System.out.println("please enter the month between 1 to 12");
}






}




}





