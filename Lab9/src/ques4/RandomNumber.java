package ques4;
import java.util.Random;
public class RandomNumber implements Runnable{
    private String playerName;
    private int randomNumber;

    RandomNumber(String playerName){
        this.playerName = playerName;
    }
    @Override
    public void run(){
        Random random = new Random();
        //generate a number between 1 and 100:
        randomNumber = random.nextInt(100)+1;
        System.out.println("Random number generated for "+playerName+" : "+ randomNumber);
    }

    public int getRandomNumber(){
        return randomNumber;
    }
}
