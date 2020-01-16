 package sisdisk;
import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import static java.rmi.registry.LocateRegistry.createRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author aluno
 */
public class CalcServidor {
    
    public CalcServidor() {
     try {
       ICalculadora c = new CalcMain();
  	LocateRegistry.createRegistry(1099);
       Naming.rebind("rmiCalculatorService",c);
       System.err.println("Running");
     } catch (Exception e) {
       System.out.println("Trouble: " + e);
     }
   }

   public static void main(String args[]) {
     new CalcServidor();
   }
}
