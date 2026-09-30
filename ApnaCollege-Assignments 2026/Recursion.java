/*Question 1 : For a given integer array of size N. You have to find all the occurrences
(indices) of a given element (Key) and print them. Use a recursive function to solve this
problem.
Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
Sample Output : 1 5 7 8 */

public class Recursion {
    public static void findoccurence(int arr[],int key,int i){
        //base case
        if(i==arr.length)return;
        if(arr[i]==key){
        System.out.println(i+" ");
        }
        findoccurence(arr,key,i+1);
    }

    

/*Question 2 :
You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”. Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0.
Sample Input : 1947
Sample Output : “one nine four seven” */


static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

public static void printDigits(int number){
    if(number==0){
        return;
    }
    int lastDigit=number%10;
    printDigits(number/10);
    System.out.print(digits[lastDigit]+"");
}

//Question 3 : Write a program to find Length of a String using Recursion.
public static int length(String str){
    if(str.length()==0){
        return 0;
    }
    return length(str.substring(1))+1;


}

/*Question 4 : We are given a string S, we need to find the count of all contiguous substrings
starting and ending with the same character.
Sample Input 1 : S = "abcab"
Sample Output 1 : 7
There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7
contiguous substrings start and end with the same character.
Sample Input 2 : S = "aba"
Sample Output 2 : 4
The substrings are a, b, a and aba.
 */
public static int countSubstrs(String str,int i,int j, int n){
    if(n==1){
        return 1;
    }
    if(n<=0){
        return 0;
    }

    int res=countSubstrs(str,i+1,j,n-1)+
            countSubstrs(str,i,j-1,n-1)-
            countSubstrs(str,i+1,j-1,n-2);

            if(str.charAt(i)==str.charAt(j)){
                res++;
            }
            return res;
}




/* Question 5:Tower Of Hanoi

You have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle
starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on
top of an even larger one).
You have the following constraints:
(1) Only one disk can be moved at a time.
(2) A disk is slid off the top of one tower onto another tower.
(3) A disk cannot be placed on top of a smaller disk. Write a program to move the disks from
the first tower to the
last using Stacks. */


public static void hanoi(int n, char A, char C, char B){
    if(n==0)
        return;

    hanoi(n-1,A,B,C);
    System.out.println(A + "to" + C);
    hanoi(n-1,B,C,A);
}


public static void main(String args[]){
        String str="abcab";
        int n=str.length();
        System.out.print(countSubstrs(str,0,n-1,n));
    }


    
}
