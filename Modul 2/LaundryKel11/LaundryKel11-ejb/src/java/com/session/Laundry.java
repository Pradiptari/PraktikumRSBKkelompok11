/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Dipta
 */
@Stateless
@LocalBean
public class Laundry {

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 double berat;
    String total;


    public String total_harga(double berat) {
        return total = String.valueOf(berat *4500);
    }


  
}
