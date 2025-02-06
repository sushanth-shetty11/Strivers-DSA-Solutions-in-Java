import java.util.*;
public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		int Rn = 0;

		while(n>0){
		 int LastDigit = n%10;
         
		 n=n/10;

		 Rn= (Rn*10)+ LastDigit;
        }

		System.out.println(Rn);
		scanner.close();

	}
}
