package com.sperrone.getorganized;
import com.sperrone.getorganized.models.Game;
import com.sperrone.getorganized.models.Toon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Game newGame = new Game();
    	Toon newToon = newGame.getNewToon();
		System.out.println(newToon.getName() + " is a level " +
				newToon.getLevel() + " " + newToon.getCharClass());

		while (newGame.getGameActive()) {
			int nextAction = newGame.getNextAction();
			switch (nextAction) {
				case 1:
					newGame.setGameActive(false);
					break;
				case 2:
					System.out.println("You fight a big monster!");
					break;
				case 3:
					System.out.println("Look at all that cool stuff");
					break;
				case 4:
					System.out.println(newToon.getInfo());
					break;
				default:
					System.out.println("I didn't understand your choice - try again");
			}

		}
    }
}
