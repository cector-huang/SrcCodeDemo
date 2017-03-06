/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package getuuid;
import java.util.UUID;

/**
 *
 * @author cector
 */
public class GetUUID {

    /**
     * @param args the command line arguments
     */
    public String getUUID(){
        UUID id = UUID.randomUUID();
        return id.toString();   
    }
    public static void main(String[] args) {
        // TODO code application logic here
        GetUUID instance = new GetUUID();
        System.out.println(instance.getUUID());
    }
    
}
