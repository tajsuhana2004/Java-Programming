public class Reverse{
    public static void reverse(int number[]){
        int first=0,last=number.length-1;

        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
        }
    }

    public static void main(Strings args[]){
        int number[]={20,34,90,56,6,4,23,67,45};

        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}

