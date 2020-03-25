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
        NodesList<String> ab=new NodesList<String>();
  
    /*  String h="hola";
        String a="chau";
        System.out.println(a.compareTo(h));*/
        
        ab.add("a");
       ab.add("bb");
         ab.add("z");
         ab.add("Z");
        ab.add("kkkk"); 
        /*ab.add("ac");
        ab.add("ad");
        ab.add("ag");
        ab.add("a");
       
        ab.add("ah");*/
      node<String>a=new node<String>("hola");
      node<String>abc=new node<String>("hola");
      abc.setSig(a);
     //   System.out.println(ab.removeLast());
        System.out.println(ab.getNodes());
        System.out.println(ab.size());
      //  System.out.println(ab.isAValueInsideTheArray("a"));

       // System.out.println(ab.max());
        
       // ab.showAll();
        
    }
    
}
