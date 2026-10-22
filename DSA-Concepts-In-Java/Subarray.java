public class Subarray{
    public static void Subarray(int number[]){
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i+1;j<number.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(Strings args[]){
        int number[]={2,3,5,6,8,9};
        Subarray(number);
    }
}
