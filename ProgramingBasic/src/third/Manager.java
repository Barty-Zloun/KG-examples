/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

/**
 *
 * @author Bartoloměj Sviták (bart1996)
 */
public class Manager {

	public void startGame() {
		MathGame game = new MathGame(3, 20);
		game.start();
	}

}
