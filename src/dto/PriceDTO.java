/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

import java.io.Serializable;

/**
 *
 * @author Paul
 */
public class PriceDTO implements Serializable{
    private double personPrice;
    private double residentDiscount;
    
    public PriceDTO(double personPrice,double residentDiscount) {
        this.personPrice = personPrice;
        this.residentDiscount = residentDiscount;
    }

    public double getPersonPrice() {
        return personPrice;
    }

    public void setPersonPrice(double personPrice) {
        this.personPrice = personPrice;
    }

    public double getResidentDiscount() {
        return residentDiscount;
    }

    public void setResidentDiscount(double residentDiscount) {
        this.residentDiscount = residentDiscount;
    }
    
    
}
