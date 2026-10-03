public class DivideAndConquer {

/* Question 1: Apply Merge sort to sort an array of Strings. (Assume that all the characters in
all the Strings are in lowercase). 
Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
Sample Output 1 : arr = { "earth", "mars", "mercury", "sun"} */

    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            //  String comparison
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= ei) temp[k++] = arr[j++];

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);

        for (String s : arr) {
            System.out.print(s + " ");
        }
    
    }
/* Question 2: Given an array of integers. Find the Inversion Count in the array. 
Inversion Count: For an array, inversion count indicates how far (or close) the array is from
being sorted. If the array is already sorted then the inversion count is 0. If an array is
sorted in the reverse order then the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
Sample Input 1 : N = 5, arr[ ] = {2, 4, 1, 3, 5}
Sample Output 1 : 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3). */

public static int merge(int arr[],int left,int mid,int right){

    int i=left,j=mid,k=0;
    int invCount=0;
    int temp[]=new int[(right-left+1)];

    while((i<mid) && (j<=right)){
        if(arr[i]<=arr[j]){
            temp[k]=arr[i];
            k++;
            i++;
        }
        else{
            temp[k]=arr[j];
            invCount+=(mid-i);
            k++;
            j++;
        }
    }

    while(i<mid){
        temp[k]=arr[i];
        k++;
        i++;
    }

    while(j<=right){
        temp[k]=arr[j];
        k++;
        j++;
    }

    for(i=left, k=0; i<=right;i++,k++){
        arr[i]=temp[k];
    }
    return invCount;


}
private static int mergeSort(int arr[],int left, int right){
    int invCount=0;
    if(right>left){
        int mid=(right+left)/2;

        invCount=mergeSort(arr,left,mid);
        invCount+=mergeSort(arr,mid+1,right);
        invCount+=merge(arr,left,mid+1,right);

    }
    return invCount;
}
public static int getInversion(int arr[]){
    int n=arr.length;
    return mergeSort(arr,0,n-1);
}








}

    

