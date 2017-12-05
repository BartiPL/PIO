package enigma;
public class Cipher {
    public void Cipher() {
      
    }
    private String alphabet;
    private int key = 1;
       
    public void setKey(int key) {
        this.key = key;  
    }
    
    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;   
    }
    
    public String Encrypt() {
        
        StringBuilder out = new StringBuilder(); //#2
        for (int i=0; i<text.length(); ++i) {
            int ch = text.charAt(i);
            int idx = alphabet.indexOf(ch);
            idx = (idx + 1) % alphabet.length();
            ch = alphabet.charAt(idx);
       //ch = ch + 1;    
       //out = out + (char)ch; //#1
            out.append((char)ch);   
      }
        
    }
    
}

