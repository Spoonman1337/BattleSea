package ShipBattle;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player playerAlex = new Player("Ivan");
        Player playerSergey = new Player("Igor");
        while(true){
            shortResult result= shortResult.Ранил;
            while (result==shortResult.Ранил || result==shortResult.Потопил){
                playerAlex.atack(playerSergey);
            }
            result= shortResult.Ранил;
            while (result==shortResult.Ранил || result==shortResult.Потопил){
                playerSergey.atack(playerAlex);
            }
        }


    }

}
