package ShipBattle;

import java.util.*;

public class Player {
    String NikName;
    int[][] myBoard = new int [10][10];
    int [][] notMyBoard = new int[10][10];
    List<Ship> listShip=new ArrayList<>();

    public Player(String nikName) {
        NikName = nikName;
        ArrayList<Integer> ships=new ArrayList<>();
        Collections.addAll(ships,4,3,3,2,2,2,1,1,1,1);
        for (Integer temp:ships) {
            randomizer(temp);
        }


    }
    shortResult atack(Player enemy,Point coordinata){
        return enemy.save(coordinata);
    }


    shortResult save(Point pointShort){
        shortResult result = null;
       int statePoint=myBoard[pointShort.y][pointShort.x];

       if(statePoint==0){
result=shortResult.Мимо;
       } else {
           Ship myCurrentShip=searchShip(pointShort);
           result=myCurrentShip.getStatePastShort(pointShort);
       }
        return result;
    }

    private Ship searchShip(Point pointShort) {

    }

    private void randomizer(Integer temp) {
        Random random = new Random();
       String keys= "abcdefgjkl";
char randomRow= keys.charAt(random.nextInt(9));
if(sum(myBoard.get(randomRow))==0){

        for(int i=0;i<10;i++){

        }


}
    }

    private int sum(int[] ints) {
        for (int i =0;i<10;i++){
           // ints.
        }
        return 0;
    }
}

enum shortResult{
    Мимо, Ранил,Потопил
}
