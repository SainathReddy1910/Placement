public class PrintNumbers{
    public static void main(String[] args) {
        System.out.println("The numbers are: ");
        int n = 100;
        print(n);
    }
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
}
