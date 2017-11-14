package DiceGame1;
import java.util.Random;
import java.util.Scanner;
public class DiceGame1 {

    
    public static void main(String[] args) {
      Scanner program = new Scanner(System.in);  
      Random dice = new Random();
      
      Player player = new PlayerComp("anon"); // Podklasy należa do klasy. 
      
      Game game = new Game();
      game.addPlayer(player);
      game.play();
      
//      int number, guess;
      //player.setName("Gracz");
      
//      do {
//          number = dice.nextInt(6) + 1;
//          System.out.println("Wylosowana liczba: " + number);
//          //guess = program.nextInt(6) + 1;
//          guess = player.guess();
//          System.out.println("Wpisz liczbę " + player.getName() + ": " + guess);
//          
//          if(number == guess) {
//          System.out.println("Brawo");
//          } else {
//                System.out.println("Źle");
//          }
//                  
//    } while (number != guess);
    
}
}