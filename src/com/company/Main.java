package com.company;

import Bibliotek.Biblio;
import Bibliotek.Export;
import Bibliotek.ImportData;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static ArrayList<Biblio> biblo;

    public static void main(String[] args) throws IOException {
        String filepath = "Data/testsample.cvs";
        String exportPath = "Data/export.cvs";
        biblo = new ArrayList<Biblio>();
        ImportData getData = new ImportData();
        Export export = new Export();
        biblo = getData.ImportData(filepath);
        export.exportToFile(exportPath, biblo);

    }
}
