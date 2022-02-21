package BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the Number to Check Prime or Not");
				int num = 0;
				try {
					
					num = Integer.parseInt(bf.readLine());
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				int count = 0;
				
				for(int i=1; i<=num; i++) {
								
					if((num%i) == 0) {
						
						count++;
					}			
				}
				if(count == 2) 
					System.out.println(num + " is a Prime Number..");
				else
					System.out.println(num + " is not a Prime Number..");
			}
		
	}


