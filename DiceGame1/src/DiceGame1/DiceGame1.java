package DiceGame1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class DiceGame1 {

    
    public static void main(String[] args) {
      
//      List<String> list = new ArrayList();
//      
//      list.add("pierwszy");
//      list.add("drugi");
//      list.add("3");
//           
//      System.out.println(list);
//      System.out.println("--------------");
//      
//      for (int i=0, len=list.size() ; i<len; ++i) {
//        String elem = list.get(i);
//        System.out.println(elem);
//     }
//      System.out.println("--------------");
//      
//      for (String elem : list) {
//          System.out.println(elem);
//      }
//      System.out.println("--------------");
//      
//      Iterator<String> it = list.iterator();
//      while(it.hasNext()) {
//          String elem = it.next();
//          System.out.println(elem);
//      }
      
       
      Scanner program = new Scanner(System.in);  
      Random dice = new Random();
     
      Player player = new PlayerComp("anon"); // Podklasy należa do klasy. 
      
      Game game = new Game();
      game.addPlayer(player);
      game.play();
      

    
}
}