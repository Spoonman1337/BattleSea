package ShipBattle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Ship {
    int trubCount;
    String name;
List<Point> listCoordinate=new ArrayList<>();



    public Ship(int trubCount, String name,Point startPoint,boolean isHorisontal,int[][] field) {
        this.trubCount = trubCount;
        this.name = name;
        if(field[startPoint.y][startPoint.x]!=0){
            System.out.println("Error #1 make ship !");
        }
        if(checkPlace(isHorisontal,trubCount)){
            if(isHorisontal==true){
                for(int i=0;i<trubCount;i++){

                }
            }else{
                for(int i=0;i<trubCount;i++){

                }
            }
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "trubCount=" + trubCount +
                ", name='" + name + '\'' +
                ", shipPlace=" + shipPlace +
                '}';
    }

}
 class Point{
    int x;
     char y;
     public Point(int x, char y) {
         this.x = x;
         this.y = y;
     }


 }
