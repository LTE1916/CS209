package practice.lab3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Practice3Answer {
    public static void main(String[]args){
        Predicate<Integer>predicate= integer -> integer.equals(0)||integer.equals(1)||integer.equals(2)
                ||integer.equals(3)||integer.equals(4);
       // printFirst();
 
        
        Scanner in=new Scanner(System.in);
        int command=1;
   
        while (command!=0){
            printFirst();
            command = in.nextInt();
        if(predicate.test(command)){
            if(command==0){
                System.exit(0);
            }else {
                System.out.println("Input size of the list:");
                int size=in.nextInt();
                ArrayList<Integer>arr = new ArrayList<>();
                System.out.println("Input elements of the list:");
                for (int i = 0; i < size; i++) {
                arr.add(in.nextInt());}
                switch (command) {
                    case (1): {
                        Object[] tmp  = arr.stream().filter(integer -> integer%2==0).toArray();
                        printAnswer(tmp);
                        break;
                    }
                    case (2): {
                        Object[]tmp=arr.stream().filter(integer -> integer%2!=0).toArray();
                        printAnswer(tmp);
                        break;
                    }
                    case(3):{
                        Object[]tmp=arr.stream().filter(integer ->!isPrime(integer)).toArray();
                        printAnswer(tmp);
                        break;
                    }
                    case(4):{
                        Object[]tmp=arr.stream().filter(integer ->!isPrime(integer)&&integer>5).toArray();
                        printAnswer(tmp);
                        break;
                    }
                }
            }
        }
        }
        

    }
    
    public static void printFirst(){
        System.out.println("Please input the function No:");
        System.out.println("1 - Get even numbers");
        System.out.println("2 - Get odd numbers");
        System.out.println("3 - Get prime numbers");
        System.out.println("4 - Get prime numbers that are bigger than 5");
        System.out.println("0 - Quit");
    }
    
    public static void printAnswer(Object[] tmp){
        System.out.println("Filter results:");
        System.out.print("[");
        for (int i = 0; i < tmp.length; i++) {
            if(i<tmp.length-1) System.out.print(tmp[i].toString()+", ");
            else System.out.print(tmp[i].toString());
        }
        System.out.println("]");
    }
    public static boolean isPrime(int num){
        boolean a=false;
        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                a=true;
                break;
            }
        }return a;
    }
}
