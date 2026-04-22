import java.util.*;
import java.util.Scanner;
import java.lang.Character;
public class VowelCons{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter the charchter to check it is vowel or consonet");
 char ch = sc.next().charAt(0);
char lower = Character.toLowerCase(ch);
// if(lower=='a' || lower=='e' ||lower=='i' ||lower=='o' ||lower=='u'){
// System.out.println("vowel");
// }
if("aeiou".indexOf(lower) != -1){
    System.out.println("Vowel");
}
else {  System.out.println("constatnt");

}

  
}




}





