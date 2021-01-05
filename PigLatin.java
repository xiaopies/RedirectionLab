import java.util.*;
public class PigLatin{
  public static String pigLatinSimple(String s){
    String a = s.toLowerCase();
    String b = s.substring(0,1);
    if (b.equals("a")|| b.equals("e")|| b.equals("i")|| b.equals("o")|| b.equals("u")){
      return(a + "hay");
    }
    else{
      return (a.substring(1,a.length()) + b + "ay");
    }

  }
  public static String pigLatin(String s){
    String a = s.toLowerCase();
    String c = s.substring(0,1);
    String[] hi = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (s.length()>=2){
    for (int i=0; i<hi.length; i++){
      if (a.substring(0,2).equals(hi[i])){
        return(a.substring(2, a.length()) + hi[i] + "ay");
      }
    }
  }
    if (c.equals("a")|| c.equals("e")|| c.equals("i")|| c.equals("o")|| c.equals("u")){
      return (a + "hay");
    }
    else{
      return (a.substring(1,a.length()) + c + "ay");
    }
  }
  public static String pigLatinBest(String s){
    String a = s.toLowerCase();
    char b = a.charAt(0);
    if (!Character.isLetter(b)){
      return a;
    }
    else{
      if (!Character.isLetter(a.charAt(a.length()-1))){
        String last = a.substring(a.length()-1, a.length());
        String word = a.substring(0, a.length()-1);
        return (pigLatin(word) + last);
      }
      else{
        return(pigLatin(a));
      }
    }
  }
  public static void main(String[] args){
    Scanner me = new Scanner(System.in);
    while (me.hasNextLine()) {
      Scanner line = new Scanner(me.nextLine());
      while (line.hasNext()) {
        String a = line.next();
        System.out.print(pigLatinBest(a));
        System.out.print(" ");
      }
      System.out.print("\n");
    }

  }

}
