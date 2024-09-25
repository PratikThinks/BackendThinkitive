import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Do while loop --> program which keep asking for numbaer untill you enter negative number

        int j;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter the nubmer");
            j = sc.nextInt();
        }
        while(j >0);
        System.out.println("Operatio over");

        //for loop : Write a program to print numbers from 0 to 100 which are divisible by 7

    for(int i=0;i<=100;i++){
        if(i%7 ==0){
            System.out.println(i);
        }
    }

    // For each loop : for iterating throgh a collection in java we can use it 
    int[] arr = {34,32,43,23};
    for(int i:arr){
        System.out.print(i + " ");
    }
    System.out.println();

}
    
}
