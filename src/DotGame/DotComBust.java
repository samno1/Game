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

        System.out.println("Добро пожаловать на нашу Игру !!");
        System.out.println("Ваша цель - потопить три сайта");
        System.out.println("Basket.com, Volley.com, Foot.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

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

    }
}
