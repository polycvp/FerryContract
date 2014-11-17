package dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Paul
 */
public class TravelDetail extends AbstractTravel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Collection<AccountDetail> passengers;
    private String licencePlate;
    private String departurePort;
    private String destinationPort;
    private Date departureTime;
    private double totalPrice;

    public TravelDetail(long id)
    {
        super(id);
    }

    public TravelDetail(long id, Collection<AccountDetail> passengers, String licencePlate, String departurePort, String destinationPort, Date departureTime, double totalPrice)
    {
        super(id);
        this.passengers = passengers;
        this.licencePlate = licencePlate;
        this.departurePort = departurePort;
        this.destinationPort = destinationPort;
        this.departureTime = departureTime;
        this.totalPrice = totalPrice;
    }

    public Collection<AccountDetail> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(Collection<AccountDetail> passengers)
    {
        this.passengers = passengers;
    }

    public String getLicencePlate()
    {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate)
    {
        this.licencePlate = licencePlate;
    }

    public String getDeparturePort()
    {
        return departurePort;
    }

    public void setDeparturePort(String departurePort)
    {
        this.departurePort = departurePort;
    }

    public String getDestinationPort()
    {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort)
    {
        this.destinationPort = destinationPort;
    }

    public Date getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime)
    {
        this.departureTime = departureTime;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }

}
