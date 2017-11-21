package DiceGame1;

import java.util.Random;

abstract public class Player {
    private Random random = new Random();
    protected String name;
        
    public Player(String name){
        setName(name);
    }
    
    public void setName(String name) {
        if( name != null && name.matches("^[a-zA-Z0-9~_-]{5,}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
           // System.err.println("Nazwa nieprawidłowa");
        }
    }
        
    public final String getName() {
        return name;
    }

    abstract public int guess();
    
}
