import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a= sc.nextInt();
        System.out.println("enetr the 2nd number");
        int b= sc.nextInt();
        System.out.println("enter the 3rd number");
        int c= sc.nextInt();
        if(a>b){
            if(a>c)
            {
                System.out.println("a is biggest");
            }
            else{
                System.out.println("c is biggest");
            }
        }
        else if(b>c){
                System.out.println("b is biggest");
            }
            else{
                System.out.println("c is biggest");
            }
        }
}