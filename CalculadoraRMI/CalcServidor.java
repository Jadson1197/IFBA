 package sisdist;
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
    int port = 10000;
    String Address;
    Registry reg;
    
    public CalcServidor() {
     try {
       ICalculadora c = new CalcMain();
       reg = LocateRegistry.createRegistry(port);
       reg.rebind("rmiCalculatorService", c);//rmi://localhost:1020/
     } catch (Exception e) {
       System.out.println("Trouble: " + e);
     }
   }

   public static void main(String args[]) {
     new CalcServidor();
   }
}
