package dto;

import java.io.Serializable;

/**
 *
 * @author Paul
 */
public abstract class AbstractAccount implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private long id;
    
    public AbstractAccount() {}
    
    public AbstractAccount(long id)
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
