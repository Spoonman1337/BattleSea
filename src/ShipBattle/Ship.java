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
        //sdffggfgfgfgfg
        this.name = name;
        if(field[startPoint.y][startPoint.x]!=0){
            System.out.println("Error #1 make ship !");
        }
//        if(checkPlace(isHorisontal,startPoint,trubCount,field)){
//            if(isHorisontal==true){
//                for(int i=0;i<trubCount;i++){
//
//                }
//            }else{
//                for(int i=0;i<trubCount;i++){
//
//                }
//            }
//        }
        if(isHorisontal==false){
            for(int i=0;i<trubCount;i++){
                field[startPoint.y+i][startPoint.x]=1;
                Point temp=new Point(startPoint.x,startPoint.y+i);
                listCoordinate.add(temp);

            }
        }else{
            for(int i=0; i<trubCount;i++){
                field[startPoint.y] [startPoint.x+i]=1;
                Point temp=new Point(startPoint.x+i,startPoint.y);
                listCoordinate.add(temp);
            }
        }
    }



    @Override
    public String toString() {
        return "Ship{" +
                "trubCount=" + trubCount +
                ", name='" + name + '\'' +
                ", shipPlace=" + //shipPlace +
                '}';
    }

}
 class Point{
    int x;
     int y;
     public Point(int x, int y) {
         this.x = x;
         this.y = y;
     }


 }
