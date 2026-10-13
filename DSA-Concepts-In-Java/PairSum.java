/* Question 1:
Find if any pair in a sorted arraylist has a target sum.
   list =[1,2,3,4,5] target=5; */

//Brute Force Approach
import java.util.*;
public class PairSum {

    public static boolean pairsum1(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;

    }
//Two Pointer Approach
public static boolean pairsum(ArrayList<Integer>list,int target){
    int lp=0;
    int rp=list.size()-1;
    while(lp!=rp){
        //case1
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        //case2
        if(list.get(lp)+list.get(rp)<target){
            lp++;
        }
        else{
            rp--;
        }

    }
    return false;
}

/* Question 2:
   Find if any pair in a Sorted and Rotated ArrayList has a target sum.
   list=[11,15,6,8,9,10], target=16
     */

   public static boolean pairsum2(ArrayList<Integer>list,int target){
    int bp =-1; //bp means breaking point
    int n=list.size();
    for(int i=0;i<list.size();i++){
        if(list.get(i)>list.get(i=1)){
            bp=i;
            break;
        }
    }
    int lp=bp+1; //smallest
    int rp=bp; //largest

    while(lp!=rp){

        //case 1
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }

        //case 2
        if(list.get(lp)+list.get(rp)<target){
            lp=(lp+1)%n;
        }
        else{
            //case 3
            rp=(n+rp-1)%n;
        }
    }
    return false;

   }

    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target=16;
        System.out.println(pairsum2(list,target));
    }

    
}
