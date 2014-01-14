package fr.gphy.m2.keuv.tpforma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author He Ia
 */
public class PDBUrlBuilder {
   public static URL getFirstPdbUrl(String uniprotId) throws IOException{
       //Proxy
    System.setProperty("http.proxyHost","cache.univpoitiers.fr");
    System.setProperty("http.proxyPort", "3128");
    
       URL url = new URL("http://www.uniprot.org/uniprot/" + uniprotId + ".txt");
   BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
   //TODO : lire le fichier
   String line;
   while((line = in.readLine()) != null){
   if(line.matches("^DR\\s+PDB;.+$")){
   in.close();
   }
   return new URL("http://www.ebi.ac.uk/pdbe/entry-files/pdb" + line.substring(10,14).toLowerCase() + ".ent");
   }
   in.close();
       return null;
   }
}

