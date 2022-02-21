package BufferedReader;
import java.io.*; 
public class armstrongnumber {
    public static void main(String[] args) throws IOException
    {  
       BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the number : ");  
        int n= Integer.parseInt(b.readLine());
        int k=n;
        int temp=0;
        for( ;n!=0;n/=10 )
            {
                int a=n%10;
                temp=temp+(a*a*a);
            }
        if (k==temp)
            System.out.print(k + " Is an Amstrong"); 
        else
            System.out.print(k+ " Is Not an Amstrong"); 
        
    }       
}



