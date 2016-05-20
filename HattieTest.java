/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hattietest;

/**
 *
 * @author peter
 */
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Date;

public class HattieTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // open database
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/subcon",
            "postgres", "k3nn3th");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
    }
    
    /**
     * Receives and processes a new node
     */
    private long NewNode(String node_data, String node_label, int my_channel,
            String my_direction, String node_class, String node_url, Date dt_received)
    {
        AddNode();
        //ActivateNode();
        //Associate();
        //SpreadAndActivate();
        //ManageActiveNodeList();
    }
    
    /**
     * Adds a node into the node store
     */
    private long AddNode(String node_data, String node_label, int my_channel,
            String my_direction, String node_class, String node_url, Date dt_received)
    {
        long nodeid=-1, nodedataid = -1;
        //check if the data exists in the node_data table
        
        //if no
        
            //write data to the node_data table and capture the new row SERIAL
            //write data to the node table and capture the new row serial
            
        //if yes
        
            // capture existing node_id serial
            
        return nodeid;
    }
    
    /**
     * Database functions
     */
    
    //lNodeExists (Returns NodeId or -1)
    //lCreateNode (Returns NodeId)
    
    //vNodeTouch (Called by above functions. Activates any accessed node)
    
    
    //vSpreadingActivation (Runs as a separate process working through active list)
    
}
