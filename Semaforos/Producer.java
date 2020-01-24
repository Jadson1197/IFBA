package pacote;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ads
 */
public class Producer extends Thread {
    
        Programa a;
        String name;
        
        int contador;
        public Producer(Programa x,String name) {
               this.name = name;
               a = x;
               contador = 0;
        }

        public void run() {

               try {
                   while (true) {
                       while (a.itemCount == 10)
                           sleep(100);
                       contador ++;
                       a.s1.down();
                       a.buffer.add(contador);
                       a.itemCount++;
                       a.s.up();
                       a.s1.up();
                       System.out.println("The produtor "+this.name+" is producing item "+contador);
                       for (int i =0;i<10000;i++);
                   }

               }

               catch(InterruptedException e) {

                       e.printStackTrace(); 

               }

        }
    
    
}
