public class PermutationCaseString {
    public static void main(String[] args) {
        String s = "ab";String op = "";
        permute(s,op);
    }
    public static void permute(String s,String op){
        if(s.isEmpty() || s.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        char c = s.charAt(0);
        op1+=Character.toLowerCase(c);
        op2+=Character.toUpperCase(c);
        s=s.substring(1);
        permute(s, op1);
        permute(s, op2);
    }
}
