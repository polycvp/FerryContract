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
public class AccountDTO implements Serializable 
{
    private static final long serialVersionUID = 1L;
    private long id;
    
    public AccountDTO() {}
    
    public AccountDTO(long id)
    {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
