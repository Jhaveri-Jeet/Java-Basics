public class methodOverloading {
    public static void display() {
        System.out.println("This is an Empty Method");
    }

    public static void display(String name) {
        System.out.println(name);
    }

    public static void main(String[] args){
        display();
        display("Jeet");
    }
}
