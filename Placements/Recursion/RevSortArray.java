import java.util.*;
public class RevSortArray{
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        int[] a = {7,2,1,6,8,9,5,4};
        for(int i=0;i<a.length;i++){
            ls.add(a[i]);
        }
        int n = ls.size();
        ls=sort(ls);
        System.out.print("The array after sorting: ");
        for(int i=0;i<a.length;i++){
            System.out.print(ls.get(i)+" ");
        }
    }
    public static ArrayList sort(ArrayList<Integer> ls){
        if(ls.isEmpty())
            return ls;
        int r = ls.get(ls.size()-1);
        ls.remove(ls.size()-1);
        ls=sort(ls);
        ls=insert(ls,r);
        return ls;
    }
    public static ArrayList insert(ArrayList<Integer> ls,int r){
        if(ls.isEmpty() || ls.get(ls.size()-1)>=r){
            ls.add(r);
            return ls;
        }
        int x = ls.get(ls.size()-1);
        ls.remove(ls.size()-1);
        ls=insert(ls, r);
        ls.add(x);
        return ls;
    }
}