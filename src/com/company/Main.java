package com.company;

import Bibliotek.Biblio;
import Bibliotek.ImportData;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    ArrayList<Biblio> biblo;

    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "Data/testsample.cvs";
        ImportData getData = new ImportData();
        getData.ImportData(filepath);

    }
}
