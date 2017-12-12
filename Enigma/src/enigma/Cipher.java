package enigma;
public class Cipher {
    private int key = 1;
    public Alphabet alphabet;

    Cipher(Alphabet alphabet) {
        this.alphabet = alphabet;
    }
    public String encrypt(String text){
        
        if(!alphabet.isTextValid(text)){
        throw new IllegalArgumentException("Tekst zawiera znaki spoza alfabetu.");
        }
        
        StringBuilder out = new StringBuilder();
        String in = text;

       for(int i=0 ; i < in.length() ; i++){
            
            int ch = in.charAt(i);
            int idx = alphabet.indexOf(ch);
            idx = (idx + key) % alphabet.length();
            ch = alphabet.charAt(idx);
            
            out.append((char)ch);
            }
        return out.toString();
    }
    
    public void setKey(int key){
        this.key = key;
    }
    
    public void setAlphabet(Alphabet alphabet){
        this.alphabet = alphabet;
    }
    
} 

