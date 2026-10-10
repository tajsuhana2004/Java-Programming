public class Backtracking {
    // Question Number 1: Backtracking of Array

    public static void changeArr(int arr[],int i,int val){

        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //Recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1); //final call step
        arr[i]=arr[i]-2;//backtracking step
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Question 2: Print all subsets of a given String

    public static void findSubsets(String str, int i,String ans ){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
        }
        findSubsets(str,i+1,ans+str.charAt(i));
        findSubsets(str,i+1,ans);
    }

    //Question 3: Print all Permutations of a String

    public static void findPermutation(String str,String ans){

        // base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //Recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String Newstr=str.subString(0,i)+str.subString(i+1);
            findPermutation(Newstr,ans+curr);

        }

    }

    //Question 4: find the number of ways of an grid

    public static int gridways(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1)//condition for last cell
        {

        return 1;

        }
        else if(i==n || j==n){
            return 0;

        }
        int w1=gridways(i+1,j,n,m);
        int w2=gridways(i,j+1,n,m);
        return w1+w2;
    }

    

    public static void main(String args[]){
        int n=3, m=3;
        System.out.println(gridways(0,0,n,m));
        
    }
}


    

