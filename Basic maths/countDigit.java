public class countDigit {
    public static int countDigits(int n){
       int count = 0;
       while(n>0){
          count++;
           n=n/10;
       }
       return count;
    }
    }

