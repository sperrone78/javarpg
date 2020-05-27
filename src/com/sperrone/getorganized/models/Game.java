package com.sperrone.getorganized.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Toon newToon;
    private Boolean gameActive;
    private ArrayList<Monster> gameMonsters;

    public Game () {
        buildNewGame();
    }

    private void buildNewGame () {
        //Create the Player
        System.out.println("Welcome to the Game!");
        System.out.println("Please Enter your name: ");
        Scanner input = new Scanner(System.in);
        String startName = input.nextLine();
        System.out.println("Please enter your class: ");
        String startClass = input.nextLine();
        newToon = new Toon(startName, startClass);

        //Add Monsters to the Game
        setGameMonsters();

        //Activate the Game
        gameActive = true;
    }

    public int getNextAction () {
        System.out.println("What would you like to do " + newToon.getName() + "?");
        System.out.println("Type: 1: Exit, 2: Fight, 3: Inventory, 4: Char");
        Scanner input = new Scanner(System.in);
        int nextAction = input.nextInt();
        return nextAction;
    }

    public Toon getNewToon() {
        return newToon;
    }

    public Boolean getGameActive () {
        return gameActive;
    }

    public void setGameActive (Boolean newState) {
        gameActive = newState;
    }

    public ArrayList<Monster> getGameMonsters() {
        return gameMonsters;
    }

    public void setGameMonsters() {
        Monster firstMonster = new Monster("Shrek", "Ogre",
                100, 100, 10,10);
        getGameMonsters().add(firstMonster);
    }
}
