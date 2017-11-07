package javaapplication3;

import java.util.Random;

public class Player {
   
   Random dice = new Random();
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if( name != null && !name.isEmpty()) {
        this.name = name;
       } else {
            throw new IllegalArgumentException();
           //System.err.println("Nazwa nieprawidłowa");
         }
    }
   
   public int guess(){
       return dice.nextInt(6) + 1;
    }
   
}
