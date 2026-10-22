public class BinarySearch{
    public static int binarysearch(int number[],int key){
        int start=0,end=number.length-1;

        while(start<=end){
            int mid =(start+end)/2;
            
            //Comparison
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                if(number[mid]>key){
                    end=mid-1;
                }
            }
            
        }
        return -1;
    }
    public static void main(Strings args[]){
        int number[]={10,45,35,78,90};
        int key=67;

        System.out.println("index of key is:"+binarysearch(number,key));
    }
}