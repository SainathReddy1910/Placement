import java.util.*;
public class SortStack{
    public static void main(String[] args) {
        int[] a = {3,5,1,7,2,6,9,8};
        Stack<Integer> sc = new Stack<>();
        for(int i=0;i<a.length;i++){
            sc.push(a[i]);
        }
        sc=sort(sc);
        //Collections.sort(sc);
        System.out.println("The stack after sorting: ");
        for(int x:sc){
            System.out.print(x+" ");
        }
    }
    public static Stack sort(Stack<Integer> sc){
        if(sc.size()==0){
            return sc;
        }
        int x = sc.peek();
        sc.pop();
        sc=sort(sc);
        sc=insert(sc,x);
        return sc;
    }
    public static Stack insert(Stack<Integer> sc,int x){
        if(sc.size()==0 || sc.peek()<=x){
            sc.push(x);
            return sc;
        }
        int y = sc.peek();
        sc.pop();
        sc=insert(sc, x);
        sc.push(y);
        return sc;
    }
}