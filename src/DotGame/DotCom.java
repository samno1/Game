package DotGame;

/**
 * Created by sam on 19.07.16.
 */
public class DotCom {
    int[] locationCells;
    int numOfHits=0;
    void setLocationCells(int[] locationCells){
        this.locationCells=locationCells;
    }
    public String CheckYourself(String stringGuess){
        int guess=Integer.parseInt(stringGuess);
        String result = "Мимоооо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
