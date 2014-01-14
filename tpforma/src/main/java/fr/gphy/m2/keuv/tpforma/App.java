package fr.gphy.m2.keuv.tpforma;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        System.out.println("-Bonjour Marion");
        System.out.println("-Bonjour Heia");
        System.out.println("-Je déclare la guerre!");
        PDBUrlBuilder.getFirstPdbUrl("PO7900");
    }
}
