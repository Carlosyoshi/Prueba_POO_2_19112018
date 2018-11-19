/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package www.cchasipanta.controlador;

import www.cchasipanta.modelo.DetalleOperacion;
import www.cchasipanta.modelo.Pallets;
import www.cchasipanta.modelo.Productos;
import www.cchasipanta.modelo.RecursosEnsamble;

/**
 *
 * @author LAB4-PC7
 */
public class ClaseMain {
    public static void main(String[] args) {
        Productos p = new Pallets('2', '1', '3');
        p.operationDetaills();
        p.relatePallets();
        
        
        
        DetalleOperacion dp = new DetalleOperacion(true, true, true);
        dp.setOpConfig();
        
        
        RecursosEnsamble re = new RecursosEnsamble(true, true, true);
        re.loarUbicationRaw();
        
    }
}
