import java.util.*;
import java.util.Scanner;
import java.lang.Character;
public class CheckCharacter{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter the charchter to check it is vowel or consonet");
 char ch = sc.next().charAt(0);
char lower = Character.toLowerCase(ch);
char uper = Character.toUpperCase(ch);
if(Character.isLetter(ch)){
    if(ch==lower){
    System.out.println("given text is lower case");
}
else if (ch==uper){


    System.out.println("given charcater is uper case");
}}

else if(Character.isDigit(ch)){

    System.out.println("given character  is number");
}
else{
    System.out.println("Given character is Special Character");
}
  
}




}





