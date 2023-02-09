import java.io.*;
public class CharWordLine
{
   public static void main(String args[])throws IOException
   {
    BufferedReader br =new BufferedReader(new FileReader("java3.txt"));
    String line;
    int wc=0,lc=0,cc=0;
    while((line=br.readLine())!=null)
    {
        lc++;
        String Words[]=line.split(" ");
        wc+=Words.length;
        for(String word:Words)
        {
            cc+=word.length();
        }
    }
    System.out.println("line count:"+lc);
    System.out.println("word count:"+wc);
    System.out.println("char count:"+cc);
   } 
}
