import java.util.Scanner;

public class Greeter {

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args){
        greet();
    }


    public static void greet(){
        String prefix = "";
        while(!prefix.equalsIgnoreCase("goodbye")){
            prefix = readGreeting();
            printGreeting(prefix);
        }
    }

    public static String readGreeting(){

        System.out.println("Prefix? ");
        String prefix = in.nextLine();

        return prefix;
    }

    public static void printGreeting(String prefix){
        System.out.println(prefix + ", world!");
    }
}