public class palindrome {
    public static boolean palindromeNumber(int n){

        int duplicate = n;

        int revNum =0;

        while(n>0){
            int lastDigit = n%10;

            revNum = (revNum*10)+ lastDigit;

            n=n/10;
        }
        if(revNum==duplicate){
            return true;
        }
            else{
                return false;
            }
          
        
         
       
    }
}