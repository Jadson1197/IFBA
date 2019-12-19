package sisdist;
import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author aluno
 */
public class CalcCliente {
    public static void main(String[] args) throws NotBoundException {
        Registry reg;
        String serverAddress = "localhost";
        String serverPort = "10000";
        try {/* 
            ICalculadora c = (ICalculadora)
                           Naming.lookup(
                 "rmi://localhost:1020/CalculatorService"); */
            
            reg = LocateRegistry.getRegistry(serverAddress,Integer.parseInt(serverPort));
            ICalculadora c = (ICalculadora) (reg.lookup("rmiCalculatorService"));
            System.out.println( c.sub(4, 3) ); 
            System.out.println( c.add(4, 5) ); 
            System.out.println( c.mul(3, 6) ); 
            System.out.println( c.div(9, 3) ); 
        } 
        catch (Exception e) { 
            System.out.println(); 
            System.out.println(e); 
        } 
    } 
}
