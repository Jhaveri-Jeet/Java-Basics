class Overloading {
    Overloading(){
        System.out.println("This is an simple call of Constructor");
    }

    Overloading(String name){
        System.out.println("This is an Overloaded Constructor " + name);
    }
}

public class constructorOverloading {
    public static void main(String[] args){
        Overloading o = new Overloading();
        Overloading e = new Overloading("Jeet");
    }
}
