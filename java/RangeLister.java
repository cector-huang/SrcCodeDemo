/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangelister;

/**
 *
 * @author cector
 */
public class RangeLister {
    
    int[] makeRange(int lower, int upper){
        int[] range = new int[(upper-lower) + 1];
        for(int i = 0; i < range.length; ++i)
        {
            range[i] = lower++;
        }
        return range;
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] range;
        RangeLister lis = new RangeLister();
        range = lis.makeRange(10, 20);
        System.out.print("The value is : [");
        for(int i = 0; i< range.length; ++i)
        {
            System.out.print(range[i] + " ");
        }
        System.out.print("]");
    }
    
}
