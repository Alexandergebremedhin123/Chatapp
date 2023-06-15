/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupchat;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
public class Groupchat extends Application {
    Socket  sa; String s1;Scene scene ;Scene scene2 ;
    String password;
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
          Image image = new Image(new FileInputStream("2.png"));
                 ImageView imageView1 = new ImageView(image);
                 imageView1.setFitHeight(30); 
                 imageView1.setFitWidth(30); 
                 imageView1.setTranslateX(20);
                 imageView1.setTranslateY(30);

             ImageView imageView2 = new ImageView(image);
                 imageView2.setFitHeight(30); 
                 imageView2.setFitWidth(30); 
                 imageView2.setTranslateX(20);
                 imageView2.setTranslateY(70);
                
              ImageView imageView3 = new ImageView(image);
                 imageView3.setFitHeight(30); 
                 imageView3.setFitWidth(30); 
                 imageView3.setTranslateX(20);
                 imageView3.setTranslateY(110);
                 
              ImageView imageView4 = new ImageView(image);
                 imageView4.setFitHeight(30); 
                 imageView4.setFitWidth(30); 
                 imageView4.setTranslateX(20);
                 imageView4.setTranslateY(150);
                
       
        Label l1=new Label("Group members");
           l1.setTranslateX(60);
           l1.setTranslateY(0);
           l1.setMinWidth(100);
        Button b1=new Button("Alexander");
           b1.setTranslateX(60);
           b1.setTranslateY(30);
           b1.setMinWidth(100);
        Button b2=new Button("Anwar");
           b2.setTranslateX(60);
           b2.setTranslateY(70);
           b2.setMinWidth(100);
        Button b3=new Button("Alemseged");
           b3.setTranslateX(60);
           b3.setTranslateY(110);
           b3.setMinWidth(100);
        Button b4=new Button("Benezer");
           b4.setTranslateX(60);
           b4.setTranslateY(150);
           b4.setMinWidth(100);
        Button b5=new Button("Add user");
           b5.setTranslateX(60);
           b5.setTranslateY(200);
            b5.getStyleClass().add("b5");
        Button b6=new Button("Send");
           b6.setTranslateX(630);
           b6.setTranslateY(300);
           b6.setMinWidth(80);
           b6.setMinHeight(60);
        Hyperlink b7=new Hyperlink("Switch User");
           b7.setTranslateX(0);
           b7.setTranslateY(-150);
           b7.getStyleClass().add("b7");
           b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                   primaryStage.setScene(scene);
                   
            }
        });
         GridPane root=new GridPane();
         
          root.getChildren().addAll(l1,b1);
          root.getChildren().addAll(b2,b3);
          root.getChildren().addAll(b4,b5);
          root.getChildren().addAll(imageView1,imageView2,imageView3,imageView4);
          
          scene = new Scene(root, 300, 250);
           
             scene.getStylesheets().add("voa/esat.css");
             root.getStyleClass().add("root");
         Label hk=new Label("GROUP CHAT");
           hk.setTranslateX(300);
           hk.setTranslateY(-170);
           hk.getStyleClass().add("hk");
         TextArea ta=new TextArea();
           ta.setTranslateX(60);
           ta.setTranslateY(70);
           ta.setMinHeight(400);
           ta.setMinWidth(640);
           ta.getStyleClass().add("ta");
         TextField s2=new TextField();
             s2.setTranslateX(60);
             s2.setTranslateY(299);
             s2.setMinHeight(63);
             s2.setMinWidth(570);
             s2.setMaxWidth(450);
            s2.getStyleClass().add("s2");
         GridPane root2=new GridPane();
         scene2=new Scene(root2,700,530);
             scene2.getStylesheets().add("voa/esat.css");
             
             root2.getStyleClass().add("root2");           
             root2.getChildren().addAll(ta,hk);
             root2.getChildren().addAll(s2,b6);
             root2.getChildren().addAll(b7);
          
    GridPane root3=new GridPane();
                Scene scene3=new Scene(root3,300,250);
                Label lab=new Label("Enter your password");
                lab.setTranslateX(60);
                lab.setTranslateY(10);
                lab.getStyleClass().add("lab");
                          PasswordField tft=new PasswordField();
                             tft.setTranslateX(60);
                             tft.setTranslateY(50);
                          Button con=new Button("submit");
                            con.setTranslateX(115);
                            con.setTranslateY(80);
                            con.getStyleClass().add("con");
                            root3.getChildren().addAll(lab,tft,con);
                            scene3.getStylesheets().add("voa/esat.css");
                            root3.getStyleClass().add("root3");
       GridPane root4=new GridPane();
                  Label lab2=new Label("Enter your username");
                        lab2.setTranslateX(30);
                        lab2.setTranslateY(10);
                  Label lab3=new Label("Enter your password");
                        lab3.setTranslateX(30);
                        lab3.setTranslateY(70);
                  TextField tft3=new TextField();
                   tft3.setTranslateX(30);
                   tft3.setTranslateY(40);
                  PasswordField tft2=new PasswordField();
                     tft2.setTranslateX(30);
                     tft2.setTranslateY(100);
                  Button con2=new Button("submit");
                           con2.setTranslateX(30);
                           con2.setTranslateY(130);
                  root4.getChildren().addAll(lab2,tft3,lab3,tft2,con2);
       
     Scene scene4=new Scene(root4,300,250);
             scene4.getStylesheets().add("voa/esat.css");
             root4.getStyleClass().add("root4");
       b1.setOnAction(new EventHandler<ActionEvent>() {
             String password="1234";
             @Override
             public void handle(ActionEvent event) {
              
                    primaryStage.setScene(scene3);
                          primaryStage.show();
                          con.setOnAction(new EventHandler() {
                          @Override
                    public void handle(Event event) {
                        if(tft.getText().equals(password)){
                                       try {
               final String HOST = "127.0.0.1";
               final int PORT = 4040;
               sa= new Socket(HOST,PORT);  
                                       }
     
            catch (IOException ex) {
            Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
              } 
            b6.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                try {
                        
                      OutputStream os = sa.getOutputStream();
                        DataOutputStream dos=new DataOutputStream(os);
                   s1="Alexander: ";
                        ta.appendText(s1+s2.getText()+"\n");
                      
                              s2.setText("");
                   } catch (IOException ex) {
                       Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
                   }
            }
        });
               primaryStage.setScene(scene2);
               primaryStage.show();    
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Error Password");
                        }
                    }
                });
                              

            }
        });
           b2.setOnAction(new EventHandler<ActionEvent>() {
                   String password="4567";
                   
            @Override
            public void handle(ActionEvent event) {
                 primaryStage.setScene(scene3);
                          primaryStage.show();
                        con.setOnAction(new EventHandler<ActionEvent>() {
                     @Override
                     public void handle(ActionEvent event) {
                       if(tft.getText().equals(password)){
               try {
               final String HOST = "127.0.0.1";
        final int PORT = 4040;
        sa= new Socket(HOST,PORT);  
      
                    b6.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                try {
                        
                      OutputStream os = sa.getOutputStream();
                        DataOutputStream dos=new DataOutputStream(os);
                   s1="Anwar: ";
                        ta.appendText(s1+s2.getText()+"\n");
                      
                              s2.setText("");
                   } catch (IOException ex) {
                       Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
                   }
            }
        });
               primaryStage.setScene(scene2);
               primaryStage.show();
         }catch (IOException ex) {
            Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
        } 
                        }
                       else{
                            JOptionPane.showMessageDialog(null,"Error Password"); 
                       }
                     }
                 });
                    
                      
            }
        });
      b3.setOnAction(new EventHandler<ActionEvent>() {
                   String password="8910";
                   
            @Override
            public void handle(ActionEvent event) {
                 primaryStage.setScene(scene3);
                          primaryStage.show();
                        con.setOnAction(new EventHandler<ActionEvent>() {
                     @Override
                     public void handle(ActionEvent event) {
                       if(tft.getText().equals(password)){
               try {
               final String HOST = "127.0.0.1";
        final int PORT = 4040;
        sa= new Socket(HOST,PORT);  
      
                    b6.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                try {
                        
                      OutputStream os = sa.getOutputStream();
                        DataOutputStream dos=new DataOutputStream(os);
                   s1="Alemeseged: ";
                        ta.appendText(s1+s2.getText()+"\n");
                      
                              s2.setText("");
                   } catch (IOException ex) {
                       Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
                   }
            }
        });
               primaryStage.setScene(scene2);
               primaryStage.show();
         }catch (IOException ex) {
            Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
        } 
                        }
                       else{
                         JOptionPane.showMessageDialog(null,"Error Password");
                       }
                     }
                 });
                    
                      
            }
        });
             b4.setOnAction(new EventHandler<ActionEvent>() {
                   String password="1235";
                   
            @Override
            public void handle(ActionEvent event) {
                 primaryStage.setScene(scene3);
                          primaryStage.show();
                        con.setOnAction(new EventHandler<ActionEvent>() {
                     @Override
                     public void handle(ActionEvent event) {
                       if(tft.getText().equals(password)){
               try {
               final String HOST = "127.0.0.1";
        final int PORT = 4040;
        sa= new Socket(HOST,PORT);  
      
                    b6.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                try {
                        
                      OutputStream os = sa.getOutputStream();
                        DataOutputStream dos=new DataOutputStream(os);
                   s1="Benezer: ";
                        ta.appendText(s1+s2.getText()+"\n");
                      
                              s2.setText("");
                   } catch (IOException ex) {
                       Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
                   }
            }
        });
               primaryStage.setScene(scene2);
               primaryStage.show();
         }catch (IOException ex) {
            Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
        } 
                        }
                       else{
                         JOptionPane.showMessageDialog(null,"Error Password");
                       }
                     }
                 });
                    
                      
            }
        });
            b5.setOnAction(new EventHandler<ActionEvent>() {
                
                   
            @Override
            public void handle(ActionEvent event) {
                 primaryStage.setScene(scene4);
                          primaryStage.show();
                        con2.setOnAction(new EventHandler<ActionEvent>() {
                     @Override
                     public void handle(ActionEvent event) {
                       String user=tft3.getText();
               try {
               final String HOST = "127.0.0.1";
        final int PORT = 4040;
        sa= new Socket(HOST,PORT);  
      
                    b6.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                try {
                        
                      OutputStream os = sa.getOutputStream();
                        DataOutputStream dos=new DataOutputStream(os);
                   //s1="Benezer: ";
                        ta.appendText(user+":"+" "+s2.getText()+"\n");
                      
                              s2.setText("");
                   } catch (IOException ex) {
                       Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
                   }
            }
        });
               primaryStage.setScene(scene2);
               primaryStage.show();
         }catch (IOException ex) {
            Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
        } 
                     
                     }
                 });
                    
                      
            }
        });  
         
          
        
        primaryStage.setTitle("Group chat");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
