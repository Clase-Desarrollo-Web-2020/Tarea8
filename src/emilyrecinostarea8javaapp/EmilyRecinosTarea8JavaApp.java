/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emilyrecinostarea8javaapp;

import gt.gob.banguat.variables.ws.InfoVariable;

/**
 *
 * @author Emily
 */
public class EmilyRecinosTarea8JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tipo de cambio:" + tipoCambioDia());
        System.out.println("Tipo de cambio:" + tipoCambioDiaString());
    }

    private static InfoVariable tipoCambioDia() {
        gt.gob.banguat.variables.ws.TipoCambio service = new gt.gob.banguat.variables.ws.TipoCambio();
        gt.gob.banguat.variables.ws.TipoCambioSoap port = service.getTipoCambioSoap();
        return port.tipoCambioDia();
    }

    private static String tipoCambioDiaString() {
        gt.gob.banguat.variables.ws.TipoCambio service = new gt.gob.banguat.variables.ws.TipoCambio();
        gt.gob.banguat.variables.ws.TipoCambioSoap port = service.getTipoCambioSoap12();
        return port.tipoCambioDiaString();
    }
    
}
