package DiceGame1;

import java.util.Random;

public class Game {
    private Random dice = new Random();
    private Player player;
    
    public void addPlayer(Player player) {
        this.player = player;
    }
    
    public void play() {
      int number, guess;
      player.setName("Gracz");
      
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
