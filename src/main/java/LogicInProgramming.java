import static Constants.Constants.kToJson;

public class LogicInProgramming {

    public static void main(String args[]) {
        System.out.println("hello world");
        Monster.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];
        Monster[] monsters = new Monster[4];
        monsters[0] = new Monster(1000, 70, 1, "Prashanth");
        monsters[1] = new Monster(800, 10, 1, "Chintu");
        monsters[2] = new Monster(550, 30, 1, "Murahari");
        monsters[3] = new Monster(700, 40, 1, "Alpha");
        Monster.reDrawBoard();
//        System.out.println(kToJson(Monster.battleBoard));
    }
}
