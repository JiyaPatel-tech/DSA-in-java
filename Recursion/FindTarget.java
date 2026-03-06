package Recursion;
import java.util.ArrayList;
//WAP to find the target element in an array
public class FindTarget {
    public static void main(String[] args) {
        int[] arr={3,5,67,8,67};
        //System.out.println(find(arr, 8, 0));
        //System.out.println(findIndex(arr, 8, 0));

        //findArray(arr, 67, 0);
        //System.out.println(list);

        //ArrayList<Integer> ans = findArray(arr, 67, 0, list);
        //System.out.println(ans);

        System.out.println(findArray2(arr,67,0));
    }
    static boolean find(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
    //if u want to return the index value
    static int findIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
    //find target array 
    //declare arraylist outside function
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static void findArray(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findArray(arr,target,index+1);
    }
    //find target array 
    //declare arraylist in returntype and via parameters
    static ArrayList<Integer> findArray(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findArray(arr,target,index+1,list);
    }

    //find targetv array
    //declare arraylist inside funcion
    //Problem: a new arraylist will be created in each recursive call
    //this one is not a good approach
    static ArrayList<Integer> findArray2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //ans for that function call only
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findArray2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
