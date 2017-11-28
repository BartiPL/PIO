package enigma;

public class Enigma {

    public static void main(String[] args) {
    String alphabet = "ABCDEF"; 
    String text = "ABCF";
    
    //String out = ""; //#1
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
   // System.out.println(out);
   System.out.println("Tekst szyfrowany: " + text);
   System.out.println("Tekst zaszyfrowany: " + out.toString());
}
}