package enigma;
 public class Alphabet {
    private Alphabet alphabet;
    private String Charset = "";
    
    public static final String ALPHA_UP_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String ALPHA_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public Alphabet(String Charset) {
     this.Charset = Charset;   
    }
    
    public void setAlphabet(Alphabet alphabet) {
     this.alphabet = alphabet;   
    }
    
    public boolean isTextValid() {
         return text.matches("^[ABC]$");
    }
    public String getCharset() {
        return Charset;
    } 
}
