package edu.upc.prop.lab.s1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author bernat
 */
public class Programa {

    public static void main(String[] args) {

        //----------------------------------------------------------------------
        System.out.println("Hello world!");

        //----------------------------------------------------------------------
        Gos gos1 = new Gos(1, "Charly", 6, "Bulldog", false);
        Gos gos2 = new Gos(2, "Rivel", 7, "Pitbull", true);
        Gos gos3 = new Gos(3, "Rivel", 7, "Pitbull", true);
        Gat gat1 = new Gat(4, "Boira", 2, "Siamés", false);
        Gat gat2 = new Gat(5, "Xipi", 13, "Maltès", true);
        Gat gat3 = new Gat(6, "Nipi", 3, "Korea", true);

        List<Mascota> mascotes = new ArrayList<>();
        mascotes.add(gos1);
        mascotes.add(gos2);
        mascotes.add(gos3);
        mascotes.add(gat1);
        mascotes.add(gat2);
        mascotes.add(gat3);
        //Collections.sort(mascotes); // ORDRE NATURAL
        //Collections.sort(mascotes, Collections.reverseOrder()); // ORDRE NATURAL invers
        
        // Comparació "adhoc" usant un Comparator
        Collections.sort(mascotes,new Comparator<Mascota>(){
            @Override
            public int compare(Mascota arg0, Mascota arg1) {
                return arg1.getId()-arg0.getId();
            }
        });
        for(Mascota m:mascotes) {
            System.out.println(">"+m);
        }
        System.out.println("========================");
        //----------------------------------------------------------------------
        Propietari p1 = new Propietari("11111111H", "Paco");
        Propietari p2 = new Propietari("22222222H", "Marta");
        Propietari p3 = new Propietari("33333333H", "Cristina");
        Propietari p4 = new Propietari("44444444H", "Pep");
        Propietari p5 = new Propietari("55555555H", "Josep");
        Propietari p6 = new Propietari("66666666H", "Pepa");

        //----------------------------------------------------------------------
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean nulla enim, viverra eu egestas sit amet, suscipit a massa. Curabitur in massa quis lectus tristique mollis. Nulla dignissim lacinia consectetur. Etiam dapibus interdum maximus. Aliquam fringilla, tortor eget pulvinar commodo, nisl urna auctor quam, vel efficitur ex nibh sit amet risus. Fusce scelerisque finibus pellentesque. Aenean hendrerit ante sit amet est tincidunt, quis luctus massa rhoncus. Maecenas metus leo, sagittis ut tincidunt et, malesuada sed urna. Phasellus interdum arcu nulla, nec porttitor lacus euismod in.";
        Map<String, Integer> frequencies = new TreeMap<>();
        String[] paraules = text.split("[ \\.,]");
        for (String p_case : paraules) {
            if (!p_case.isEmpty()) {
                String p = p_case.toLowerCase();
                //System.out.println(">"+p);
                Integer comptatge = frequencies.get(p);
                if (comptatge == null) {
                    // no existia la paraula a la taula
                    comptatge = 0;
                }
                comptatge++;
                frequencies.put(p, comptatge);
            }
        }
        for (String paraula : frequencies.keySet()) {
            System.out.println(">" + paraula + ":"
                    + frequencies.get(paraula));
        }

        //----------------------------------------------------------------------
    }

}
