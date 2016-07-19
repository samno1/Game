package DotGame;

/**
 * Created by sam on 19.07.16.
 */
import java.util.*;

public class DotComBust {
    private GameHelper helper=new GameHelper();
    private ArrayList<DotCom> dotComArrayList = new ArrayList<DotCom>();
    private int numOfGuess=0;

    private void setUpGame(){
        //Создодим несколько Сайтов и Присвоем им адреса
        DotCom one = new DotCom();
        one.setName(" Basket.com");
        DotCom two = new DotCom();
        two.setName("Volley.com");
        DotCom three = new DotCom();
        three.setName("Foot.com");
        dotComArrayList.add(one);
        dotComArrayList.add(two);
        dotComArrayList.add(three);

        System.out.println("\tДобро пожаловать на нашу Игру !!");
        System.out.println("Возмите карандаш или где нибудь в голове (^.^) нарисуйте доски 7X7(abcdefg X 1234567)\nна котром размещены 3 сайты " +
                  "по 3 последоательным раздядам.");
        System.out.println("Ваша цель - потопить три сайта : ");
        System.out.println("\t-Basket.com\n\t-Volley.com\n\t-Foot.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов.\n");

        for (DotCom dotComToSet: dotComArrayList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }

    }
    private void startPlaying(){
        while (!dotComArrayList.isEmpty()){
            String userGuess = helper.getUserInput("Сделайте ход: ");
            CheckUserGuess(userGuess);
        }
        finishGame();
    }
    private void CheckUserGuess(String userGuess){
        numOfGuess++;
        String result= "Мимо";
        for (DotCom dotComToTest : dotComArrayList){
            result= dotComToTest.CheckYourself(userGuess);
            if (result.equals("Попал")){
                break;
            }
            if (result.equals("Потопил")){
                dotComArrayList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят");
        if (numOfGuess<=18){
            System.out.println("Все ! Вам потребовалось "+numOfGuess+" попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули (^.^)");
        }else {
            System.out.println("Все ! Вам потребовалось "+numOfGuess+" попыток.");
            System.out.println("Рыбы  водят хороводы вокуг ваших вложении (-_-)");
        }
    }
    public static void main(String[]args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
