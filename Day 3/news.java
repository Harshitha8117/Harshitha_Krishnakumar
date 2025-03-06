import java.util.*;
public class news{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
        int count=-1;
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                count=i;
                break;
            }
            else{
                count=-1;
            }
        }
        if(count!=0)
        System.out.print(count);
        else
        System.out.print("No");
    }
}