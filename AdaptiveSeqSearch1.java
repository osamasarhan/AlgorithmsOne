/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchingalgorithms;

/**
 *
 * @author bposso00
 */
public class AdaptiveSeqSearch1 {
    
    
    public int searchArray(int[] array, int numberForSearch, char type){        
// 
        int size = array.length;
        for (int j = 0; j < array.length-1; j++){
            
            if (type == 'n'){
             if (size == 500) SearchingAlgorithms.adap1_seqSearchCounter500n+=2;
             if (size == 2500) SearchingAlgorithms.adap1_seqSearchCounter2500n+=2;
             if (size == 12500) SearchingAlgorithms.adap1_seqSearchCounter12500n+=2;
             if (size == 62500) SearchingAlgorithms.adap1_seqSearchCounter62500n+=2;
            }    
            
            if (array[j] == numberForSearch){
                
                return j;

            
            }
            int temp = array[j];
                array[j] = array[1];
                array[1] = temp;
            
        }
        
          
        return -1;
                  
    }
}
