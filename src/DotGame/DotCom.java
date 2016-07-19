package DotGame;

/**
 * Created by sam on 19.07.16.
 */
import java.util.ArrayList;
public class DotCom {
    private  ArrayList<String> locationCells;
    //private int numOfHits=0;
    void setLocationCells(ArrayList<String> locationCells){
        this.locationCells=locationCells;
    }
    public String CheckYourself(String userInput){
//        int guess=Integer.parseInt(stringGuess);

         String result = "Мимоооо";
        int index = locationCells.indexOf(userInput);
        if (index>=0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result="Потопил";
            }else {
                result="Попал";
            }
        }
//
//        System.out.println(result);
       return result;

    }
    public void setNamePet(String namePet){
        this.namePet=namePet;
    }

}
