public class BitManipulation {

    //Check if a number is odd or even
    public static void OddOrEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Number is even");
        }
        else{
             System.out.println("Number is odd");
        }
    }

    //Get Ith bit
    public static int getbit(int n,int i){
        int bitmask=1;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    //set Ith bit
    public static int setbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    //Clear Ith bit
    public static int clearbit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }

    //Update Ith bit
    public static int updatebit(int n, int i, int newbit){
        n=clearbit(10,2);
        int bitmask=newbit<<i;
        return n|bitmask;
    }

    //Clear Last bits
    public static int clearlastbit(int n, int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }

    //Clear range of bits
    public static int clearBitsinRange(int n,int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a/b;
        return n & bitmask;
    }

    public static void main(String args[]){

        // Binary AND operation
        System.out.println(5 & 6);

        // Binary OR operation
        System.out.println(2|5);

        //XOR operation
        System.out.println(5^6);

        //One's Complement
        System.out.println(~5); 

        //Binary Left Shift
        System.out.println(5<<2);// Formula(a<<b=a*2 power b);

        //Binary right shift
        System.out.println(6>>1);// Formula(a>>b=a/2 power b);

        OddOrEven(3);
        System.out.println(getbit(3,2));
        System.out.println(setbit(10,2));
        System.out.println(clearbit(10,2));
        System.out.println(updatebit(10,2,1));
        System.out.println(clearlastbit(10,2));
        System.out.println(clearBitsinRange(10,2,7));





    }
    
}
