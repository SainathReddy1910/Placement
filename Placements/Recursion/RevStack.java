import java.util.*;
public class RevStack{
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(1);sc.push(2);sc.push(3);sc.push(4);sc.push(5);
        sc=reverse(sc);
        System.out.println("The stack after reversing is: ");
        for(int x:sc){System.out.print(x+" ");}
    }
    public static Stack reverse(Stack<Integer> sc){
        if(sc.size()==1){
            return sc;
        }
        int te = sc.pop();
        sc=reverse(sc);
        sc=insert(sc,te);
        return sc;
    }
    public static Stack insert(Stack<Integer> sc,int el){
        if(sc.isEmpty()){
            sc.push(el);
            return sc;
        }
        int tr = sc.pop();
        sc=insert(sc, el);
        sc.push(tr);
        return sc;
    }
}