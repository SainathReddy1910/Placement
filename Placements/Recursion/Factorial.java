public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int x = fact(n);
        System.out.println(x);
    }
    public static int fact(int n){
        if(n==1 || n==0)
            return 1;
        else    
            return n* fact(n-1);
    }
}
