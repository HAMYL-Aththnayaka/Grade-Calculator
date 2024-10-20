/* a java program to find the grade based on the score obtained by student 
SCORE   GRADE
90-100		A
80-89		B
70-79		C
60-69		D
 0-59		E
 */
import java.util.Scanner;
 public class grade{
	 public static void main(String args[]){
		 Scanner reader=new Scanner(System.in);
			System.out.println("Enter a marks:");
				int mark=reader.nextInt();
		 
		 if((mark>=90) && (mark<=100)){
			System.out.println("Your Grade is : A");
		 }
		 else if(mark>=80){
			System.out.println("Your Grade is : B");
		 }
		 else if(mark>=70){
			System.out.println("Your Grade is : C");
		 }
		 else if(mark>=60){
			System.out.println("Your Grade is : D");
		 }
		 else if(mark >= 0){
			System.out.println("Your Grade is : E");
		 }
		 else{
			System.out.println("Your Grade is Invalid");
		 }
	 }
 }
 
 
