package dto;

import java.io.Serializable;

/**
 *
 * @author Rick
 */
public abstract class AbstractVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    private String licensePlate;

    public AbstractVehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public AbstractVehicle() {
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
