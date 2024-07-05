
import java.util.Scanner;
public class compliment {
    static void comp(int n){
        int d=0;
        int arr[]=new int[40];
        while(n!=0)
        {
            arr[d] = n%2;
            n/=2;
            d++;
        }
        for(int i=0 ; i<d ; i++)
        {
            if(arr[i]==0)
                 arr[i]=1;
            else
                arr[i]=0;
        }
        int s=0;
        for(int i=0 ; i<d ; i++)
        {
            s+=arr[i]*Math.pow(2,i);
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int f;
        f=ob.nextInt();
        comp(f);

    }
}
