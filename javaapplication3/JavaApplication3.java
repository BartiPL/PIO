package javaapplication3;
import java.util.*;
import java.util.Random;
public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        Random dice = new Random(); 
        Player player = new Player();
        player.setName("");
        int a,b;
        do{
            a = dice.nextInt(6)+1; 
            System.out.println("WYLOSOWANA TO: "+a);
            b = player.guess();
            System.out.println("GRACZ >" + player.getName() + "< LOSUJE: "+b);
            
            if(a==b){
            System.out.println("Brawo!");
            }else if(a!=b){
            System.out.println("Źle!");
            }
            
        }while(a!=b);
    }
}