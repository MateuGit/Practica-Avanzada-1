/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.genericos;

import java.util.LinkedList;

import java.util.List;

/**
 *
 * @author Facu
 * @param <N>
 */
public class NodesList<N extends Comparable> {

    node<N> nodes;

    public void add(N obj) {

        if (this.nodes == null) {
            this.nodes = new node<N>(obj);
        } else {
            node<N> ob = this.nodes;

            while (ob.getSig() != null) {
                ob = ob.getSig();
            }
            node<N> newValue = new node<N>(obj);
            ob.setSig(newValue);
        }

     
    }

    public node<N> getNodes() {
        return nodes;
    }

    public void showAll() {
        if (this.nodes == null) {
            System.out.println("no hay cosas");
        } else {
            node<N> ob = this.nodes;
            do {
                System.out.println(ob.getObjetoPrincipal());
                System.out.println("------------");
                ob = ob.getSig();

            } while (ob != null);
        }

    }

    public boolean isAnObjectInsideTheArray(node<N> obj) {

        if (this.nodes == null) {
            return false;
        } else {
            node<N> nodeToCompare = this.getNodes();
            do {
                if (nodeToCompare.equals(obj)) {
                    return true;
                }
                nodeToCompare = nodeToCompare.getSig();
            } while (nodeToCompare != null);
        }
        return false;
    }

    public boolean isAValueInsideTheArray(N parameterObjectToTest) {

        if (this.nodes == null) {
            return false;
        } else {
            node<N> baseNode = this.getNodes();
            do {

                if (baseNode.equalsValue(parameterObjectToTest)) {
                    return true;
                }
                baseNode = baseNode.getSig();
            } while (baseNode != null);
        }
        return false;
    }
    //ACA TOMO A BASENODE Y ARRIBA CREO UNA ISNTANCIA NUEVA, POR ESO EL SIG=NULL
    //preguntar

    public N max() throws Exception {

        if (this.nodes == null) {
            throw new Exception();//crear propias excepciones
        } else {

            node maximum = this.getNodes();

            if (maximum.getSig() == null) {
                return (N) maximum.getObjetoPrincipal();
            }
            node sig = this.getNodes().getSig();

            do {

                if (maximum.compareTo(sig) < 0) {
                    maximum = sig;
                }

                sig = sig.getSig();
            } while (sig != null);

            return (N) maximum.getObjetoPrincipal();
        }

    }

    public N min() throws Exception {

        if (this.nodes == null) {
            throw new Exception();//crear propias excepciones
        } else {

            node minimum = this.getNodes();

            if (minimum.getSig() == null) {
                return (N) minimum.getObjetoPrincipal();
            }
            node sig = this.getNodes().getSig();

            do {
                if (minimum.compareTo(sig) > 0) {
                    minimum = sig;
                }
                sig = sig.getSig();
            } while (sig.getSig() != null);

            return (N) minimum.getObjetoPrincipal();
        }

    }

    public node removeLast() {
        node nodeBase = this.getNodes();

        if (nodeBase == null) {
            return null;
        } else if (nodeBase.getSig() == null) {
            nodes = null;
            return nodeBase;
        } else {
        
            while (nodeBase.getSig().getSig() != null) {
                nodeBase = nodeBase.getSig();
            }
                node lastNode;
                lastNode = nodeBase.getSig();
                nodeBase.setSig(null);
            
            return lastNode;
        }
    }
    public node getFirst() {
        return this.getNodes();
    }
    public int size() {
        int size=0;
         node nodeBase = this.getNodes();
        while (nodeBase!=null) {
           size +=1;
                    nodeBase=nodeBase.getSig();
        }
        return size;
    }
    
    

}
