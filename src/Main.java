
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.Serializable;



public class Main {
    public static void main(String[] args) {
        Lista<Cliente> listaC = new Lista<>();
        Lista<Administrador> listaA = new Lista<>();
        
        System.out.println(" Bienvenidos Fitnes Studio");
        System.out.println(" presione a modo administrador");
        System.out.println(" presione c modo cliente");
        Scanner scanner = new Scanner(System.in);
        String mode = scanner.next();
        
        switch(mode){
            case "a":
             System.out.println(" bienvenido administrador");
             
             System.out.println(" ingrese la cantidad de ususarios");
             int canU  = scanner.nextInt();
             
             System.out.println(" ingrese su nombre");
             String nameA = scanner.next();
             
             System.out.println(" ingrese su identificacion");
             long idA = scanner.nextLong();
             
             System.out.println(" ingrese su edad");
             int ageA = scanner.nextInt();
             
             System.out.println(" ingrese tipo admin uno");
             String tipo  = scanner.next();
             Administrador primer = new Administrador(canU, nameA, idA, ageA, tipo);
             
             listaA.insert(primer);
             
             System.out.println(primer);
             
             try{
                 ObjectOutputStream escribirA = new ObjectOutputStream(new FileOutputStream("administrador.dat") );
                 escribirA.writeObject(listaA);
                 ObjectInputStream recuperarA = new ObjectInputStream(new FileInputStream ("administrador.dat") );
                 Lista<Administrador> listaA_leida= (Lista<Administrador>)recuperarA.readObject();
                 recuperarA.close();
                 /*for( Administrador e : listaA_leida){
                     System.out.println(e);                    
                 }*/
             }catch(Exception e){
                 
             } 
             break;
                
            case "c":
              System.out.println(" bienvenido usuario fitness");
             
             System.out.println(" tipo de membresia ");
              while(scanner.hasNext()){ 
             String tipoC1  = scanner.next();
             
             System.out.println(" estado de membresia");
             boolean c=true;
             
             System.out.println(" ingrese su nombre");
             String nameC = scanner.next();
             
             System.out.println(" ingrese su identificacion");
             long idC = scanner.nextLong();
             
             System.out.println(" ingrese su edad");
             int ageC = scanner.nextInt();
             
             System.out.println(" ingrese tipo cliente uno");
             String tipoC  = scanner.next();
             
             Cliente primerC = new Cliente(tipoC1,c, nameC,  idC, ageC, tipoC);
             
             listaC.insert(primerC);
             listaC.output();
             
             try{
                 ObjectOutputStream escribirC = new ObjectOutputStream(new FileOutputStream("clientes.dat") );
                 escribirC.writeObject(listaC);
                 ObjectInputStream recuperarC = new ObjectInputStream(new FileInputStream ("clientes.dat") );
                 Lista<Cliente> listaC_leida= (Lista<Cliente>)recuperarC.readObject();
                 recuperarC.close();
                 listaC.output();
                 /*for( Administrador e : listaA_leida){
                     System.out.println(e);                    
                 }*/
             }catch(Exception e){
                 
             } 
                
                
                
                }  
             break;
        }
         
                
             
         }
        
        
        
        
        //lista.insert(5);
        //lista.insert(7);
        //lista.output();
    
}
