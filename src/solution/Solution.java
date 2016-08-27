/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Oskar
 */
public class Solution {
    
    
    public int solution(int[] A){
        int bloquemax = 0,profundidadmax=0;
        for (int bloque : A) {
            if(bloque>bloquemax){
                bloquemax = bloque;
            }
            profundidadmax = (bloquemax-bloque)>profundidadmax?(bloquemax-bloque):profundidadmax;
        }
        return profundidadmax;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] A = {1,3,2,1,2,1,5,3,3,4,2};
       // int[] A = {5,8};
       System.out.println(new Solution().solution(A));
       
    }
    
}
