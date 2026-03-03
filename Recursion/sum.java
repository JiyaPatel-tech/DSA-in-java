package Recursion;
//sum of n numbers using recursion
public class sum {
    public static void main(String[] args) {
        int ans=sumOfNum(5);
        System.out.println(ans);
        
    }
    static int sumOfNum(int n){
        if(n<=1){
            return 1;
        }
        return n+(sumOfNum(n-1));
    }
}
