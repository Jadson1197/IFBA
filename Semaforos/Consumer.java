package pacote;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ads
 */
public class Consumer extends Thread {
    
        Programa a;
        String name;
        public Consumer(Programa x, String name) {
               a = x;
               this.name = name;
        }

        public void run() {

               try {
                   while (true) {
                       while (a.itemCount == 0)
                           sleep(100);
                       int item = 0;
                       a.s.down();
                       a.s1.down();
                       item = (Integer) a.buffer.get(0);
                       a.buffer.remove(0);
                       a.s1.up();
                       a.itemCount--;
                       System.out.println("The consumer "+this.name+" is consuming item "+item);
                       for (int i =0;i<10000;i++);
                   }

               }

               catch(InterruptedException e) {

                       e.printStackTrace(); 

               }

        }
    
    
}
