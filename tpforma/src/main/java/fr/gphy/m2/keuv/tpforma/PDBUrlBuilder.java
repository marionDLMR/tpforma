package fr.gphy.m2.keuv.tpforma;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author He Ia
 */
public class PDBUrlBuilder {
   public static URL getFirtPdbUrl(String uniprotId) throws IOException{
   // TODO : gérer le proxy
       URL url = new URL("http://www.uniprot.org/uniprot/" + uniprotId + ".txt");
   BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
   //TODO : lire le fichier
   return null;
   }
}

