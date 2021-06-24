public class ArrayToString
{
   public static void main(String args[])
   {
      char[] ch = {'H','e','l','l','o','W','o','r','l','d'};
      String str = new String(ch);
      System.out.println(str);
 
      String str2 = String.valueOf(ch);
      System.out.println(str2);
   }
}