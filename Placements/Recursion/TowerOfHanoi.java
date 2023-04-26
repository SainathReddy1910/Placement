public class TowerOfHanoi{
    public static void main(String[] args) {
        int n = 3;
        move(3,'A','B','C');
    }
    public static void move(int n,char a,char b,char c){
        if(n==1){
            System.out.println("Move "+n+" from "+a+" to "+c);
            return;
        }
        move(n-1,a,c,b);
        System.out.println("Move "+n+" from "+a+" to "+c);
        move(n-1,b,c,a);
    }
}