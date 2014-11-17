package dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Paul
 */
public class ReservationDetail extends AbstractReservation implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private Collection<AccountDetail> passengers;
    private String departurePort;
    private String destinationPort;
    private Date departureTime;
    private Date arrivalTime;
    private String vehicleType;
    private String licencePlate;
    private String totalPrice;

    public ReservationDetail(String reservationSerialNumber)
    {
        super(reservationSerialNumber);
    }

    public ReservationDetail(Collection<AccountDetail> passengers, String departurePort, String destinationPort, Date departureTime, Date arrivalTime, String vehicleType, String licencePlate, String totalPrice, String reservationSerialNumber)
    {
        super(reservationSerialNumber);
        this.passengers = passengers;
        this.departurePort = departurePort;
        this.destinationPort = destinationPort;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.vehicleType = vehicleType;
        this.licencePlate = licencePlate;
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

    public Date getArrivalTime()
    {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime)
    {
        this.arrivalTime = arrivalTime;
    }

    public String getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public String getLicencePlate()
    {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate)
    {
        this.licencePlate = licencePlate;
    }

    public String getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice)
    {
        this.totalPrice = totalPrice;
    }

   
}
