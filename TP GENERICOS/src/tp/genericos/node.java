/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.genericos;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Facu
 * @param <T>
 */
public class node<T extends Comparable> {
    private T objetoPrincipal;
    private node<T> sig;   

    public node(T objetoPrincipal) {
        this.objetoPrincipal = objetoPrincipal;
    }

    public node() {
    }
    
    public node createWithValue(T objetoPrincipal) {
       return new node(objetoPrincipal);
    }
    
    public node createWithoutValues() {
        return new node();
    }
    
    
 
    
    public node<T> getSig() {
        return sig;
    }

    public void setSig(node<T> sig) {
        this.sig = sig;
    }

    public T getNombre() {
        return objetoPrincipal;
    }

    public void setNombre(T nombre) {
        this.objetoPrincipal = nombre;
    }

    public T getObjetoPrincipal() {
        return objetoPrincipal;
    }

    public void setObjetoPrincipal(T objetoPrincipal) {
        this.objetoPrincipal = objetoPrincipal;
    }

   

    public int compareTo(T value) {
        return objetoPrincipal.compareTo(value);
    }
     public int compareTo(node<T> value) {
        return objetoPrincipal.compareTo(value.getObjetoPrincipal());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.objetoPrincipal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final node<?> other = (node<?>) obj;
        if (this.objetoPrincipal==other.objetoPrincipal && this.sig==other.sig) {           
            return true;
        }
      
        return false;
    }
    
       
    public boolean equalsValue(T value) {

        if (this == value) {
            return true;
        }
        if (value == null) {
            System.out.println("aaaa");
            return false;
        }       
        if (this.objetoPrincipal==value) {           
            return true;
        }    
        return false;
    }

    @Override
    public String toString() {
        return "objeto{" + "objetoPrincipal=" + objetoPrincipal + ", sig=" + sig + '}';
    }

  

    
  
}
