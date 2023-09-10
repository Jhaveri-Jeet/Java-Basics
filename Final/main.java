class increment {
    public final int num = 10;
    // This is an error bcz we cant use the final variable to increment.
    // void incre (){
    //     num++;
    // }
}

class main {
    public static void main (String args[]){
        increment i = new increment();
        System.out.println(i.num);
    }
}