import java.util.Scanner;

public class elifladder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark==100)
        System.out.println("Centum");
        else if(mark>=80)
        System.out.println("above 80");
        else if(mark>=35)
        System.out.println("pass");
        else
        System.out.println("fail");
    }
}
