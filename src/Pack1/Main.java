package Pack1;
import java.io.*;
import java.io.IOException;
public class Main
{

    public static void main(String[] args) throws IOException
    {
        File f1=new File("Wali.txt");
        f1.createNewFile();
        FileWriter fw=new FileWriter(f1);
        fw.write("Example:");
        fw.flush();
        fw.close();
        FileReader fr=new FileReader(f1 );
        char[] ch=new char[(int)f1.length()];
        fr.read(ch);
        for(char ch1 : ch)
        {
            System.out.print(ch1);
        }
        fr.close();
    }
}
