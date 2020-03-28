/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.genericos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Facu
 */
public class TPGENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        NodesList<String> ab = new NodesList<String>();
        ab.add("agustin");
        ab.add("bravo");
        ab.add("zeta");
        ab.add("Zet");
        ab.add("franco");
        ab.add("acz");

        System.out.println(ab.removeLast());
        System.out.println(ab.getNodes());
        System.out.println(ab.size());
        System.out.println(ab.isAValueInsideTheArray("a"));

        System.out.println(ab.max());

         ab.showAll();
    }

}
