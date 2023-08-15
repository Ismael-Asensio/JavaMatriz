import java.io.*;
import java.util.Scanner;

public class DemoMatriz1{
  
   public static int Ma[][];
   public static int i,nf,nc,j;
   public static Matriz n=new Matriz();

   public static void main(String args[]){
      Scanner s=new Scanner(System.in);
 
     try{
         do{
	System.out.println("Escriba el numero de filas");
  	    nf=s.nextInt();
          }while(nf<=0 || nf>10);

         do{
	System.out.println("Escriba el numero de columnas");
  	    nc=s.nextInt();
          }while(nf<=0 || nf>10);

        Ma=new int[nf][nc];
  
          for(i=0;i<nf;i++){
          for(j=0;j<nc;j++){
          System.out.print("Matriz ["+i+"]["+j+"]: ");
          Ma[i][j]=s.nextInt();
         }
        }

     	for(i=0;i<nf;i++){
       	   for(j=0;j<nc;j++){
     	      System.out.print("\t"+Ma[i][j]); 
      	  }
     	 System.out.println(" ");
    	}
   }catch(Exception e){System.out.println(e.getMessage());} 
  }  
}