package dto;

import java.io.Serializable;

/**
 *
 * @author Rick
 */
public class TrafficDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    public TrafficDTO(long id) {
        this.id = id;
    }

    public TrafficDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
