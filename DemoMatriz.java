import java.io.*;
import java.util.Scanner;

public class DemoMatriz{
  
   public static int Ma[][];
   public static int i,nf,j;
   public static Matriz n=new Matriz();

   public static void main(String args[]){
      Scanner s=new Scanner(System.in);


     Ma=new int[10][3];
 
     try{
         do{
	System.out.println("Escriba el numero de filas");
  	    nf=s.nextInt();
          }while(nf<=0 || nf>10);
  
          for(i=0;i<nf;i++){
            do{
               System.out.println("Digite los valores");
               Ma[i][0]=s.nextInt();
               n.setM(Ma); 
             }while(Ma[i][0]<=0);

            do{
               System.out.println("Digite los valores");
               Ma[i][1]=s.nextInt();
               n.setM(Ma); 
             }while(Ma[i][1]<=0); 
        }

     	for(i=0;i<nf;i++){
       	   for(j=0;j<3;j++){
     	      System.out.print("\t"+Ma[i][j]); 
      	  }
     	 System.out.println(" ");
    	}
   }catch(Exception e){System.out.println(e.getMessage());} 
    }  
}