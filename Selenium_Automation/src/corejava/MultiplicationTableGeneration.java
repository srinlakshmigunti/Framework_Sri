package corejava;
 import java.util.Scanner;
  public class MultiplicationTableGeneration {
   public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  int n;
	  n = s.nextInt();
	  System.out.println("the multion table is");
	  for(int i=1; i<=10; i++){
		  System.out.println(n + "* "+ i +" = " + (n*i));
	}
  }
}
	


