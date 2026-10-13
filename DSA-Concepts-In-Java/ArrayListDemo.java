import java.util.ArrayList;
public class ArrayListDemo {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();

        //Operations On ArrayList
        //1. Add Element
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(5);

        System.out.println(list);

        //2.Get element
        int element=list.get(3);
        System.out.println(element);

        //3. Remove Element
        list.remove(2);
       System.out.println(list);

        //4. Set Element
        list.set(2,3);
        System.out.println(list);

        //5. Contains Element
        System.out.println(list.contains(5));


        //Size of Array list
        System.out.println(list.size());//Printing the size of the list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }


        //Print Reverse of an Array List
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        //Find Maximum in an ArrayList
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }
        System.out.println("max element ="+max);


        //Swap 2 Numbers
        int idx1=1, idx2=3;
        swap(list,idx1,idx2);
        System.out.println(list);

        

        //Multi-Demensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer>list1 =new ArrayList<>();
        ArrayList<Integer>list2 =new ArrayList<>();
        ArrayList<Integer>list3 =new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //nested loops
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer>currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }






    }



    
}
