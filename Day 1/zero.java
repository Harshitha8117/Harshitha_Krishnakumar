import java.util.Scanner;

public class zero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int dig=n%10;
            if(dig==0){
                count+=1;
            }
            n/=10;
        }
        if(count>0)
        System.out.println("yes");
        else
        System.out.println("No");
    }
}
