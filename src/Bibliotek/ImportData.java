package Bibliotek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportData {

    public ArrayList<Biblio> ImportData(String filepath) throws FileNotFoundException {
        ArrayList<Biblio> bibliotek = new ArrayList<Biblio>();
        File fh = new File(filepath);
        int nroflibs = 1;
        String line = "";
        if (fh.exists()) {
            Scanner nl = new Scanner(fh);
            while ((nl.hasNextLine())) {
                line = nl.nextLine();
                String[] lineArr = line.split(",");
                Biblio tempbilbo = new Biblio(lineArr[3],lineArr[6],Integer.parseInt(lineArr[7]),lineArr[9]);
                Adresse adresse = new Adresse(Integer.parseInt(lineArr[0]),lineArr[1],lineArr[2],lineArr[3],lineArr[4],Double.parseDouble(lineArr[8]),Double.parseDouble(lineArr[5]));
                tempbilbo.setAdresse(adresse);


                bibliotek.add(tempbilbo);
                System.out.println(nroflibs + ":");
                System.out.println(tempbilbo);
                nroflibs++;


            }
        } else {
            throw new FileNotFoundException();
        }
return bibliotek;
    }
}
