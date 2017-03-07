/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parser;

/**
 *
 * @author cector
 */
public class Parser {
    
    public void toUpperCase(String[] text){
        for(int i=0; i< text.length; ++i)
        {
            text[i] = text[i].toUpperCase();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Parser par = new Parser();
        par.toUpperCase(args);
        for(int i=0; i< args.length; ++i)
        {
            System.out.print(args[i] + " ");
        }
    }
    
}
