/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package third;

import java.util.Scanner;

/**
 *
 * @author Bartoloměj Sviták
 */
public class SoundGame {
        private int qc;
	private SoundUtils soundUtils = new SoundUtils();
	private int difficulty;
	Scanner scanner = new Scanner(System.in);
        
        
       public SoundGame (int qc, int difficulty){
           this.qc=qc;
           this.difficulty =  difficulty;
           
}
}