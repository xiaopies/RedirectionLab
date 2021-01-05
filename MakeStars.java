import java.util.*;
public class MakeStars{
  public static void main(String[] args){
    Scanner bob = new Scanner(System.in);
    while (bob.hasNextLine()){
      Scanner line = new Scanner(bob.nextLine());
      while (line.hasNext()){
        String a = line.next();
        for (int i =0; i<a.length(); i++){
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println("\n");
    }
  }
}
