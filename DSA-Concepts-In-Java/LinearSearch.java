public class LinearSearch{
    public static int linearsearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;            
        }
        }
            return -1;
        
    }
public static void main(Strings args[]){
    int number[]={23,56,89,90};
    int key=89;

    int index = linearsearch(number,key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key is :"+ index);
        }
    }
}

