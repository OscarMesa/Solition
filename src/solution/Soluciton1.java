/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author Oskar
 */
class Solution {
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
}
