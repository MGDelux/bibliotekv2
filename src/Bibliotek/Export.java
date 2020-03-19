package Bibliotek;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Export {
    public void exportToFile(String filepath, ArrayList<Biblio> biblo) throws IOException {

        File fh = new File(filepath);
        if (!fh.exists()) {
            fh.createNewFile();
        }
        FileWriter fw = new FileWriter(fh);

        try (BufferedWriter br = new BufferedWriter(new FileWriter(fh))) {

            for (Biblio d : biblo) {
                br.write(d + "\n");
            }
            System.out.println("File exported");

        } catch (IOException e) {
            System.out.println("Unable to write file.");
        }
        fw.close();
    }
}
