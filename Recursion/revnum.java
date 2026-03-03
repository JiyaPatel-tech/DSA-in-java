package Recursion;
//reverse the number using recursion

public class revnum {
    public static void main(String[] args) {
        revnumber(5);
    }
    static void revnumber(int n)
    {
        if(n==0){
            return;
        }
        revnumber(n-1);
        System.out.println(n);
    }
}
