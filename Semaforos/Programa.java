package pacote;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ads
 */
import java.util.ArrayList;

public class Programa {
    
        int itemCount;
        ArrayList buffer;
    
        Semaphore s = new Semaphore(0);
        Semaphore s1 = new Semaphore(1);
        
        Programa () {
            itemCount = 0;
            buffer = new ArrayList(); 
        }
    
        int compartilhada;
    
        public static void main(String[] args) {
               Programa t = new Programa();
               t.run();
        } 
        
        public void run() {
            Consumer c = new Consumer(this,"C");
            Producer p = new Producer(this,"P");
            c.start();
            p.start();
            Consumer c1 = new Consumer(this,"C1");
            Producer p1 = new Producer(this,"P1");
            c1.start();
            p1.start();
        }
}
