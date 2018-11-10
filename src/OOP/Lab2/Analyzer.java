package OOP.Lab2;

import java.util.Scanner;

public class Analyzer {
    public static void main(String args[]){
        Data store = new Data();
        Scanner scan = new Scanner(System.in);
        Boolean in = true;
        while (in){
            System.out.println("Enter number (Q to quit): ");
            String s = scan.next();
            if(s.charAt(0)=='Q'){
                System.out.println(store.get_average());
                System.out.println(store.get_max());
                in = false;
            }
            else{
                int value = Integer.parseInt(s);
                store.Add(value);
            }
        }
    }
}