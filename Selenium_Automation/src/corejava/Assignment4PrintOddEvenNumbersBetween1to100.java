package corejava;

public class Assignment4PrintOddEvenNumbersBetween1to100 {
  public static void main(String args[]){
	 //Print even numbers
	  System.out.println("The Even value <=100:");
	 for(int i=2; i<=100; i+=2){
	   System.out.print(i + " ");
	 }
	 System.out.println();
	 //Print odd numbers
	 System.out.println("The Odd value <=100:");
	 for(int i=1; i<=100; i+=2){
		 System.out.print(i + " ");
	 }
  }
}
