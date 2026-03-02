//89. Gray Code
//https://leetcode.com/problems/gray-code/description/?envType=problem-list-v2&envId=math

import java.util.*;
public class GrayCode {

    public static List<Integer> grayCode(int n) {

        List<Integer> result = new ArrayList<>();
        
        int total = 1 << n;   

        for (int i = 0; i < total; i++) {
            result.add(i ^ (i >> 1));   
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        List<Integer> ans = grayCode(n);

        System.out.println("Gray Code Sequence:");
        System.out.println(ans);

        sc.close();
    }
}
