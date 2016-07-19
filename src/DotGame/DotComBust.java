package DotGame;

/**
 * Created by sam on 19.07.16.
 */

public class DotComBust {
    public static void main(String[]args){
        System.out.println(" Welcome back Sam !");
        int numOfGuess=0;
        CheckUserGuess helper = new CheckUserGuess();
        DotCom dot = new DotCom();
        int randomNum= (int)(Math.random()*5);
        int [] locations = {randomNum,randomNum+1,randomNum+2};
        //dot.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive == true){
            String guess =helper.getUserInput("Введите Число ");
            String result = dot.CheckYourself(guess);
            numOfGuess++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println(" Игра окончена");
                System.out.println(" Вам потребовалос "+ numOfGuess+" попыток(и)");
            }
        }
    }
}
