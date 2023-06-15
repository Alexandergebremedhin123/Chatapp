/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverchatcenter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alem
 */
public class Serverchatcenter {
        public  Serverchatcenter(){
              final int PORT = 4040;
                             try {
                                   
            ServerSocket ss = new ServerSocket(PORT);
                     System.out.println("Server is waiting...");
                while(true){
                  Socket socket = ss.accept(); 
                     
                   Communication c=new Communication(socket);
                   c.start();
                   //socket.close();
                }
                               }
                catch (IOException ex) {
                   Logger.getLogger( Serverchatcenter.class.getName()).log(Level.SEVERE, null, ex);
               }

        } 
    public static void main(String[] args) {
      
             new  Serverchatcenter();
                   
          // socket.close();
                       
       }
    
}
class Communication extends Thread {
        Socket socket;
        
        Communication(Socket ss) {
            socket = ss;
        }
        public void run() {
            try {
             
                while (true) {
                    OutputStream ons=socket.getOutputStream();
                           InputStream ins=socket.getInputStream();
       DataInputStream dis=new DataInputStream(ins);
         DataOutputStream dos=new DataOutputStream(ons);
              
                       System.out.println("Enter a message to the clients");
                     Scanner  sc=new Scanner(System.in);
                     String s=sc.nextLine();
                     
                   dos.writeUTF(s);
                            String chat1=dis.readUTF();
                   System.out.println(chat1);
                // socket.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
