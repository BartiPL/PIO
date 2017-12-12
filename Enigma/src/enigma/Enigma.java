package enigma;
//barti
public class Enigma {

 public static void main(String[] args) {
 
        Alphabet alphabet = new Alphabet(Alphabet.ALPHA_UP_SPACE);
        
        System.out.println(alphabet.isTextValid("ABC"));        
             
        
        Cipher cipher = new Cipher(alphabet);
        
        cipher.setAlphabet(alphabet);
        cipher.setKey(1);
        
        String in = "ABCDEF";
        
        String out = cipher.encrypt(in);
        
        System.out.println("Tekst szyforwany: "+in);        
        System.out.println("Tekst zaszyforwany: "+out);

        
    }
}
