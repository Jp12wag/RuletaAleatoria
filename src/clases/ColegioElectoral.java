/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;

/**
 *
 * @author Wagner Alcantara
 */
public class ColegioElectoral {

    public String zona;
    public List<String> colegio;
    public String recintos;

    public ColegioElectoral(String zona, List<String> colegio, String recintos) {
        this.zona = zona;
        this.colegio = colegio;
        this.recintos = recintos;
    }

    @Override
    public String toString() {
        return zona + "-" + colegio + " (" + recintos.length() + " recintos)";
    }
}
