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
public class AccountDetail extends AccountDTO implements Serializable 
{
    private static final long serialVersionUID = 1L;
    private String cprNo;
    private String password;
    private String name;
    private String email;
    private String address;
    private boolean isResident;
    
    public AccountDetail(long id)
    {
        super(id);
    }
    
    public AccountDetail(long id, String cprNo, String password, String name, String email, String address, boolean isResident)
    {
        super(id);
        this.cprNo = cprNo;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.isResident = isResident;
    }

    public String getCprNo() {
        return cprNo;
    }

    public void setCprNo(String cprNo) {
        this.cprNo = cprNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsResident() {
        return isResident;
    }

    public void setIsResident(boolean isResident) {
        this.isResident = isResident;
    }
    
    
}
