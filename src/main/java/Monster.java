
import com.google.gson.Gson;

import java.util.Arrays;

public class Monster {

    static char[][] battleBoard = new char[10][10];

    public static void buildBattleBoard() {
        for (char[] row : battleBoard) {
            Arrays.fill(row, '*');
        }
    }

    public static void reDrawBoard() {
        int k = 0;
        while (k < 30) {
            System.out.print("-");
            k++;
        }
        System.out.println();
        for (int i = 0; i < battleBoard.length; i++) {
            for (int j = 0; j < battleBoard[i].length; j++) {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println();
        }
        k = 0;
        while (k < 30) {
            System.out.print("-");
            k++;
        }
    }


    private static String getToJson() {
        return new Gson().toJson(battleBoard);
    }


    public final String TOMBSTONE = "Here lies a dead monster";
    public int health = 500;
    public int attack = 20;
    public int movement = 2;
    public int xPosition = 2;
    public int yPosition = 2;
    public boolean alive = true;

    public String name = "Big Monster";
    public char nameChar = 'B';
    public static int numOfMonsters = 0;


    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public Monster(int health, int attack, int movement, String monsterName) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = monsterName;

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;
        int randomX, randomY;
        do {
            randomX = (int) (Math.random() * maxXBoardSpace);
            randomY = (int) (Math.random() * maxYBoardSpace);
        } while (battleBoard[randomX][randomY] != '*');

        this.xPosition = randomX;
        this.yPosition = randomY;
        this.nameChar = this.name.charAt(0);
        battleBoard[this.yPosition][this.xPosition] = this.nameChar;
        numOfMonsters++;
    }

    public Monster() {
        numOfMonsters++;
    }

    public Monster(int health) {
        this.health = health;
    }

    public Monster(int newHealth, int newAttack) {
        this.health = newHealth;
        this.attack = newAttack;
    }

}
