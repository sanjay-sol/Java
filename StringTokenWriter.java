import java.io.*;
import java.util.StringTokenizer;
public class Stringcapabilities
{
    public static void main(String args[])throws IOException
    {
        StringTokenizer st=new StringTokenizer("hellow,world!how are you?!");
        int count=st.countTokens();
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        StringReader  sr=new StringReader("hellow world !How are you");
        int i;
        while((i=sr.read())!=-1)
        {
            System.out.println((char)i);
        }
        sr.close();
        StringWriter sw=new StringWriter();
        sw.write("hello world!how are you!");
        System.out.println(sw.toString());
        sw.close();

    } 
}
