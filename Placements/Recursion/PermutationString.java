public class PermutationString {
    public static void main(String[] args) {
        String s = "ABC";String op = "";
        op+=s.charAt(0);
        System.out.println(op);
        s=s.substring(1);
        permute(s,op);
    }
    public static void permute(String s,String op){
        if(s.isEmpty() || s.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op1+=" ";
        op1+=s.charAt(0);
        op2+=s.charAt(0);
        s=s.substring(1);
        permute(s, op1);
        permute(s, op2);
    }
}
