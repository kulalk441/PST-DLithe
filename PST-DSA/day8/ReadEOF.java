package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadEOF {
    public static void main(String[] args) throws IOException{
        // read from /p
        BufferedReader bIn = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String eachLine = "";
        int lNo = 1;
        // while((eachLine=bIn.readLine())!=null)
        while(!(eachLine = bIn.readLine()).
                equals("EOF")){
            System.out.println(lNo+" "+eachLine);
            lNo++;
        }
        bIn.close();
    }
}
