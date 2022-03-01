package corejava;

//import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
	//Scanner s = new Scanner(System.in);
	int age= 99;
		
		
		if (age<=2) {
			System.out.println("infant " +age);
		}else if((age>2) &&(age<=12))
			  {
			  System.out.println("Child " +age);
		      }else if((age>12) &&(age<=25))
		            {
			        System.out.println("Youth " +age);
		            }else if((age>25) &&(age<=59))
		                   {
			             System.out.println("Adult " +age);
		}else if((age>59) &&(age<=100)) {
			System.out.println("SeniorCitizen " +age);
			}
		
		}
	}

