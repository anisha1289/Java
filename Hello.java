import java.util.Scanner;
public class Hello{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello Java");
    System.out.println("Enter a num: ");
    int num = sc.nextInt();
    System.out.println("The Number is: "+num);
  }
}
