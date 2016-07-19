package DotGame;

/**
 * Created by sam on 19.07.16.
 */
import java.util.*;
public class DotCom {
    private  ArrayList<String> locationCells;
    private  String name;
    public void setLocationCells(ArrayList<String> locationCells){
        this.locationCells=locationCells;
    }
    public void setName(String name){
        this.name=name;
    }

    public String CheckYourself(String userInput){
        String result="Мимо";
        int index = locationCells.indexOf(userInput);
        if (index>=0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result="Потопил";
                System.out.println("Ой! Вы потопили "+name+" : (");
            }else {
                result= "Попал";
            }
        }
        return result;
    }

}
