import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int a=scan.nextInt();

       int l1[]=new int[a];
       for(int i=0;i<a;i++){
           l1[i]=scan.nextInt();
       }
       int b=scan.nextInt();
       int c=a+b;
       int l2[]=new int[c];
       for(int i=a;i<c;i++){
           l2[i]=scan.nextInt();
       }
       int list[] = new int[a + b];
       for(int i=0;i<a;i++) {
           list[i]=l1[i];
       }
       for(int i=a;i<c;i++) {
           list[i]=l2[i];
       }


      
       Arrays.sort(list);
       for(int i=0;i<a+b;i++) {
           System.out.print(list[i]+"->");
       }
     System.out.print("NULL");


   }

}
