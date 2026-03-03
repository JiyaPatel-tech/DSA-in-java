package Recursion;
//product of 1 to n
//factorial of a number
public class product {
    public static void main(String[] args) {
        int ans=fact(5);
        System.out.println(ans);
        
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*(fact(n-1));
    }
}
