import java.util.*;
public class ifl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=50){
            if(mark>=80)
            System.out.print("Above 80");
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}