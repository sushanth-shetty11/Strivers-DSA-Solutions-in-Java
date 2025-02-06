import java.util.*;
public class Armstrong {
	
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	int n=scanner.nextInt();
	int sum =0;
	int duplicate =n;


	while(n>0){
		int lastdigit = n%10;
		sum=sum+(lastdigit*lastdigit*lastdigit);
		n=n/10;
	}
	if(sum==duplicate){
		System.out.println(true);
	}else{
		System.out.println(false);

	}
	scanner.close();
  }
}
