import java.util.*;
import java.util.Scanner;
public class EquIsoSca{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please enter first slide");
int slide1 = sc.nextInt();
System.out.println("please enter second slide");
int slide2 = sc.nextInt();
System.out.println("please enter third slide");
int slide3 = sc.nextInt();
if(slide1+slide2>slide3 && slide1+slide3>slide2 && slide3+slide2>slide1){

  if(slide1==slide2 && slide2==slide3){

    System.out.println("this is equilateral Tringle ");

  }
  else if((slide1==slide2 && slide1!=slide3) || (slide1==slide3 && slide1!=slide2) || (slide3==slide2 && slide3!=slide1))
    {
    System.out.println("this is isosceles tringle");
  }
  else{
    System.out.println("scalene tringle");
  }



}
else {

System.out.println("this is not a valid tringle");

}
}




}





