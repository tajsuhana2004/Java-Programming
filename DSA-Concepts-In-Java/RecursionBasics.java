public class RecursionBasics {

//Print numbers from n to 1(Decreasing Order)
   public static void PrintDec(int n) {
      if (n == 1) {
         System.out.println(n);
         return;
      } 
         System.out.println(n + " ");
         PrintDec(n - 1);
      }
   
      //Print numbers form n to 1(Increasing Order)
      public static void PrintInc(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        PrintInc(n-1);
        System.out.print(n + "  ");
      }

      //Print the factorial of a number
      public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
      }

      //Print sum of n natural numbers

      public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=sum(n-1);
        int Sn=n+Snm1;
        return Sn;
      }

      // Print the Nth Fibonacci Number
      public static int fib(int n){
         if(n==0 || n==1){
            return n;
         }
         int fnm1=fib(n-1);
         int fnm2=fib(n-2);
         int fn=fib(n-1)+fib(n-2);
         return fn;
      }

      //Check whether the array is sorted or not
      public static boolean isSorted(int arr[],int i){
         if(i==arr.length-1){
            return true;
         }
         if(arr[i]>arr[i+1]){
            return false;
         }
         return isSorted(arr,i+1);
      }

      //To find the first occurence of an element in an array
      public static int firstoccurence(int arr[],int key,int i){
         if(i==arr.length){
            return -1;
         }
         if(arr[i]==key){
            return i;
         }
         return firstoccurence(arr,key,i+1);
      }

      //To find the first occurence of an element in an array
      public static int lastoccurence(int arr[],int key,int i){
         if(i==arr.length){
            return -1;
         }
         int isfound=lastoccurence(arr,key,i+1);
         if(isfound==-1 && arr[i]==key){
            return i;
         }
         return isfound;
      }

      //Optimized form to find Pow(x,n)
      public static int optimizedPower(int a, int n){
         if(n==0){
            return 1;
         }
         int halfPower=optimizedPower(a,n/2);
         int halfPowerSq=halfPower*halfPower;

         if(n%2!=0){
            halfPowerSq=a*halfPowerSq;
         }
         return halfPowerSq;
      }


      //Tiling Problem Approach
      public static int tilingproblem(int n){
         //base case
         if(n==0 || n==1){
            return 1;
         }
         //vertical choice
         int fnm1=tilingproblem(n-1);

         //horizontal choice
         int fnm2=tilingproblem(n-2);

         int totways=fnm1+fnm2;
         return totways;
      }

      //Remove Duplicates in a string
      public static void RemoveDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
         //Base class
         if(idx==str.length()){
            System.out.println(newstr);
            return;
         }
         char currchar=str.charAt(idx);
         if(map[currchar-'a']==true){
            RemoveDuplicates(str,idx+1,newstr,map);
         }
         else{
            map[currchar-'a']=true;

         RemoveDuplicates(str,idx+1,newstr.append(currchar),map);
         }
         
      }

      //Friends Pairing Problem
      public static int friendsPairing(int n){
         //Base case
         if(n==1||n==2){
            return n;
         }
         //single 
         int fnm1=friendsPairing(n-1);

         //Pair
         int fnm2=friendsPairing(n-2);
         int pairways=(n-1)*fnm2;

         //totalways
         int totways=fnm1+pairways;
         return totways;
      }

      //Print all binary string of size N without consecutive ones
      public static void printBinStrings(int n,int lastPlace, String str){
         // base case
         if(n==0){
            System.out.println(str);
            return;
         }
         printBinStrings(n-1,0,str+"0");
         if(lastPlace==0){
            printBinStrings(n-1,1,str+"1");
         }
      }



   public static void main(String args[]) {
      printBinStrings(3,0,"");
   }
}


    

