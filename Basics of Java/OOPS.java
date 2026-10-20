public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.settip(5);
        System.out.println(p1.getTip());

        
    }
}
    class Pen{
        private String color;
        private int Tip;

        String getColor(){
            return this.color;
        }

        void setcolor(String newcolor ){
            color= newcolor;
        }
        int getTip(){
            return this.Tip;
        }

        void settip(int newtip){
            Tip=newtip;
        }
    }

    class BankAccount{
        public String username;
        private int password;

        public void setpassword(int newpassword){
            password=newpassword;
        }
    }
    

