public class SubString{
    public static void main(String[] args) {
        String a="abc";String op="";
        reverse(a,op);
    }
    public static void reverse(String s,String op){
        if(s.length()==0 || s.isEmpty()){
            
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op2+=s.charAt(0);
        s=s.substring(1);
        reverse(s,op1);
        reverse(s,op2);
    }
}