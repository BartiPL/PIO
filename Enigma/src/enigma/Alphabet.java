package enigma;
 public class Alphabet {
    
    public static final String ALPHA_UP_SPACE = "ABCDEFGHIJKLMNOPQRSTWZX";
    
    private String charset= "";
    private int length;
    
    public Alphabet(String charset){
        if (charset.isEmpty()) {
            throw new IllegalArgumentException("Zestaw znaków nie może być pusty");
        }
        this.charset = charset;
    }

    public boolean isTextValid(String text){
        return text.matches("^["+charset+"]+$");
    }

    String getCharset() {
        return charset;
    }
    
    public int indexOf(int ch){
        return charset.indexOf(ch);
    }

    public int charAt(int idx) {
        return charset.charAt(idx % charset.length());     
    }

    public int length() {
        return charset.length();
    }
    
}