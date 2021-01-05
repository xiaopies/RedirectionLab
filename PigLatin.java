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
  // Scanner me = new Scanner(System.in);
  // while (me.hasNextline()) {
  //   Scanner line = new Scanner(me.nextLine());
  //   while (line.hasNext()) {
  //     String a = line.next();
  //     a.toLowerCase();
  //
  //     String f = a.substring(0,1);
  //     if (f.equals("a") ||f.equals("e") || f.equals("i") ||f.equals("0") ||f.equals("u") ||){
  //       System.out.print(a + "hay");
  //     }
  //     else{
  //       System.out.print(a.substring(1,a.length()) + f + "ay");
  //     }
  //     System.out.print(" ");
  //   }
  //   System.out.print("\n");
  // }
}
