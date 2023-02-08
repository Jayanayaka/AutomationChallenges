package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DataManager {

    String fileName;

    ArrayList <String>storeValues = new ArrayList<String>();
    public DataManager(String FileName)
    {
        this.fileName=FileName;
    }

    public void ReadFile()
    {
        try {
            BufferedReader br = new BufferedReader( new FileReader(fileName));

            StringTokenizer st = null;
            int lineNumber = 0, tokenNumber = 0;

            while( (fileName = br.readLine()) != null)
            {
                lineNumber++;
                System.out.println(fileName);
                storeValues.add(fileName);
                //break comma separated line using ","
                st = new StringTokenizer(fileName, ",");

                while(st.hasMoreTokens())
                {

                    System.out.println(st.nextToken());

                }

                //reset token number
                tokenNumber = 0;

            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }



    //mutators and accesors
    public void setFileName(String newFileName)
    {
        this.fileName=newFileName;
    }
    public String getFileName()
    {
        return fileName;
    }
    public ArrayList getFileValues()
    {
        return this.storeValues;
    }
    public void displayArrayList() {
        for (int x = 0; x < this.storeValues.size(); x++) {
            System.out.println(storeValues.get(x));
        }

    }

}
