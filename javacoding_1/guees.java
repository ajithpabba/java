import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputnumber;
    public int noOfGuess;
    public  void setNoOfGuess(int noOfGuess){
        this.noOfGuess=noOfGuess;
    }
    int getnoOfGuess(){
        return noOfGuess;
    }
    Game(){
        Random rand= new Random();
        this.number=rand.nextInt(100);

    }
    void takeInput(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the guess number");
        inputnumber=sc.nextInt();

    }
    boolean isCorrrect(){
        if(inputnumber==number){
            return true;

        }
        else if(inputnumber<number){
            System.out.println("the number is too low");
        }
        else if(inputnumber>number){
            System.out.println("the number is too high");
        }
        return false;
    }
}

public class guees {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeInput();
            b=g.isCorrrect();
            System.out.println(b);

        }
        
        
    }
    
}
