import java.util.Scanner;
import java.util.*;
public class AlphabetRange{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the character ");
    char ch = sc.next().charAt(0);
    char lower= Character.toLowerCase(ch);
    if(Character.isLetter(ch)){
    if("abcdefghijklm".indexOf(lower)!=-1){
        System.out.println("character alise in first half");
    }else{
         System.out.println("character alise in second half");
    }
       

    }else {
        System.out.println("please eneter correctalphabet character");
    }


}






}