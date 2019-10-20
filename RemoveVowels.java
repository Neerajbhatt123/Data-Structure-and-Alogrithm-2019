import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class RemoveVowels
{
   public static void main(String[] args) throws IOException 
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String strFirst, str = "";
      char ch, chCase;
      int a, len;
      System.out.println("Please enter a sentence : ");
      strFirst = br.readLine();
      len = strFirst.length();
      for(a = 0; a < len; a++) 
      {
         ch = strFirst.charAt(a);
         System.out.println("Value of ch char :::"+ch);
         chCase = Character.toLowerCase(ch);
         System.out.println("Value of chCase char :::"+chCase);
         switch(chCase) 
         {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
               break;
            default:
               str = str + ch;
         }
      }
      System.out.println("String without vowels : " + str);
   }
}