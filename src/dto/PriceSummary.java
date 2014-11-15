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
public class PriceSummary extends PriceDTO implements Serializable {

    private double carPrice,lorryPrice,largeMachineryPrice,personPrice,resindentDiscount;
    
    public PriceSummary(double personPrice, double residentDiscount) {
        super(personPrice, residentDiscount);
    }
    
    public PriceSummary(double personPrice, double residentDiscount,double carPrice,double lorryPrice, double largeMachineryPrice) {
        super(personPrice, residentDiscount);
        this.personPrice = personPrice;
        this.resindentDiscount = residentDiscount;
        this.carPrice = carPrice;
        this.lorryPrice = lorryPrice;
        this.largeMachineryPrice = largeMachineryPrice;
    }
    
    
}
