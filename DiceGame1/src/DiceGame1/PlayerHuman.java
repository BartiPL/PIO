package DiceGame1;

import java.util.Scanner;

public class PlayerHuman extends Player {
    
    private Scanner scanner = new Scanner(System.in);
        
    public PlayerHuman(String name){
        super(name);
    }
    
    @Override
    public int guess(){
        System.out.print("Podaj liczbe: ");
        return scanner.nextInt();
    }
}
