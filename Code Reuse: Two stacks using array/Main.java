import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int stack1[] = new int[a];


        for(int i=0;i<a;i++){
            stack1[i] = scan.nextInt();
        }


        int b = scan.nextInt();
        int stack2[] = new int[b];

        for(int j=0;j<b;j++){
            stack2[j] = scan.nextInt();
        }

        int m = scan.nextInt();
        int n = scan.nextInt();

        System.out.println("Stack 1 Elements:");
        for(int i=a-1;i>=0;i--){
            System.out.print(stack1[i]+" ");
        }
        System.out.println();

        System.out.println("Stack 2 Elements:");

        for(int j=b-1;j>=0;j--){
            System.out.print(stack2[j]+" ");
        }
        System.out.println();




       if(m>a) {
            System.out.println("Stack underflow. pop from stack 1 failed");
            System.out.println("Stack 1 Elements:");
         //   System.out.println();
        }else{
            System.out.println("Stack 1 Elements:");
            for(int i=a-m-1;i>=0;i--){

                    System.out.print(stack1[i]+" ");


            }
        }
            
        if(n>b) {
            System.out.println("Stack underflow. pop from stack 2 failed");
            System.out.println("Stack 2 Elements:");
        }else{
            System.out.println();
            System.out.println("Stack 2 Elements:");
            for(int j=b-n-1;j>=0;j--){

                    System.out.print(stack2[j]+" ");


            }
          System.out.println();
        }


    }
}
