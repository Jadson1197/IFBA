/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculasockets;

/**
 *
 * @author jsantana
 */

import java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculaSockets_Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in); 
  
        // Step 1:Create the socket object for carrying 
        // the data 
        DatagramSocket ds = new DatagramSocket(); 
  
        InetAddress ip = InetAddress.getLocalHost(); 
        byte buf[] = null; 
  
        // loop while user not enters "bye" 
        while (true) 
        { 
            System.out.print("Digite a equação no seguinte formato:"); 
            System.out.println("'Operando1 (espaço) operador (espaço) Operando2'"); 
            String inp = sc.nextLine(); 
            buf = new byte[65535]; 
  
            // convert the String input into the byte array. 
            buf = inp.getBytes(); 
  
            // Step 2:Create the datagramPacket for sending the data. 
            DatagramPacket DpSend = 
                      new DatagramPacket(buf, buf.length, ip, 1234); 
  
            // invoke the send call to actually send the data. 
            ds.send(DpSend); 
  
            // break the loop if user enters "exit" 
            if (inp.equals("exit")) 
                break; 
  
            buf = new byte[65535]; 
            DatagramPacket DpReceive = 
                                 new DatagramPacket(buf, buf.length); 
            ds.receive(DpReceive); 
            
            String bf = new String(buf,0,buf.length);
            String answer = "";
            
            for(int count = 0; bf.toString().charAt(count) != '|';count++){
                answer+= bf.toString().charAt(count);
            }
            
            
            System.out.println("Resultado = " + 
                                answer); 
        } 
    }
    
}
