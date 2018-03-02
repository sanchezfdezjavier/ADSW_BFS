
package es.upm.dit.adsw.ej1;

import java.lang.*;

/*
@author Javier Sanchez Fernandez
@version 11-2-2018
 */


public class Link {

    private String src; // source node
    private String dst; // destination node
    private int weight; //edge's weight

    public Link(String src, String dst, int weight) throws IllegalArgumentException {
        if (src.equals(null) || src.equals("") || dst.equals(null) || dst.equals("") || weight <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.src = src;
            this.dst = dst;
            this.weight = weight;
        }
    }

    public String getSrc() {
        return this.src;
    }

    public String getDst() {
        return this.dst;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Link [src=" + src + ", dst=" + dst + ", weight=" + weight + "]";
    }
}