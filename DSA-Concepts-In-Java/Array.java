import java.util.*;
public class Array{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(Strings args[]){
        int marks[]={97,98,56};
        update(marks);

        //printing our marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+ " ");
        }
        System.out.println();




        // Creating Array
        //int marks[]=new int[100];

        // Taking input from the user
        //Scanner sc = new Scanner(System.in);
        /* System.out.println("Enter the marks of OS:");
        marks[0]=sc.nextInt();
        System.out.println("Enter the marks of CNN:");
        marks[1]=sc.nextInt();
        System.out.println("Enter the marks of DBMS:");
        marks[2]=sc.nextInt();

        //Updating the marks of OS
        //marks[1]=78;
        //System.out.println("Enter the marks of OS:" + marks[1]);

        //Calculate the percentage
        int percentage = (marks[0]+marks[1]+marks[2] )/ 3;

        System.out.println("percentage:"+ percentage + "%"); 
        */


    

        

    }
}