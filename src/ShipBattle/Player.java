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
        Collections.addAll(ships,4,3);
        for (Integer temp:ships) {
            randomizer(temp);
        }
        System.out.println("Ваша эскадра размещена !");


    }
    shortResult atack(Player enemy){
        Scanner scanner = new Scanner(System.in);
        System.out.println(NikName+"your time to do this");
        System.out.println("tipe x coords");
        int x= scanner.nextInt();
        System.out.println("tipe y coords");
        int y= scanner.nextInt();
        Point coordinata=new Point(x,y);
        return enemy.save(coordinata);
    }

    public static void main(String[] args) {
        Player player1 = new Player("Cergey");
    }
    shortResult save(Point pointShort){
        shortResult result = null;
       int statePoint=myBoard[pointShort.y][pointShort.x];

       if(statePoint==0){
result=shortResult.Мимо;
       } else {
           Ship myCurrentShip=searchShip(pointShort);
          // result=myCurrentShip.getStatePastShort(pointShort);
       }
        return result;
    }

    private Ship searchShip(Point pointShort) {
return null;
    }

    private void randomizer(int trubCount) {
        Scanner scan = new Scanner(System.in );
                 viewField(myBoard);
        System.out.println("Корабль на "+trubCount+" трубы.");
                 System.out.println("Введите координату х стартовой точки -");
        int x= scan.nextInt();
        System.out.println("Введите координату у стартовой точки -");
        int y= scan.nextInt();
        System.out.println("Корабль будет размещен по горизонтали ?");
        boolean horisontal= scan.nextBoolean();
        new Ship(trubCount,"name",new Point(x,y),horisontal,myBoard );
    }

    private void viewField(int[][] board) {
        for (int[] temp:board){
            System.out.println(Arrays.toString(temp));
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
