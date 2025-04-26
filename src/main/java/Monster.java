package main.java;

import java.util.Arrays;

public class Monster {

    static char[][] battleBoard = new char[10][10];

    public static void buildBattleBoard() {
        for (char[] row : battleBoard) {
            Arrays.fill(row, '*');
        }
    }


    public final String TOMBSTONE = "Here lies a dead monster";
    public int health = 500;
    public int attack = 20;
    public int movement = 2;
    public int xPosition = 2;
    public int yPosition = 2;
    public boolean alive = true;


    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public Monster(int health, int attack, int movement) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }

    public Monster() {

    }

    public Monster(int health) {
        this.health = health;
    }

    public Monster(int newHealth, int newAttack) {
        this.health = newHealth;
        this.attack = newAttack;
    }

}
