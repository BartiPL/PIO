package DiceGame1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Random dice = new Random();
    private Player player;
    private List<Player> players = new ArrayList();
    
    public void addPlayer(Player player) {
        this.player = player;
    }
       
    public void play() {
        Random dice = new Random();
      int number, guess;
            
      do {
          number = dice.nextInt(6) + 1;
         System.out.println("Wylosowana liczba: " + number);
          //guess = program.nextInt(6) + 1;
          guess = player.guess();
          System.out.println("Wpisz liczbę " + player.getName() + ": " + guess);
          
          if(number == guess) {
          System.out.println("Brawo");
          } else {
                System.out.println("Źle");
          }
                 
    } while (number != guess);
    }
}
