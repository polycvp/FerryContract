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
    private Collection<AbstractVehicle> vehicles;
    private String departurePort;
    private String destinationPort;
    private Date departureTime;
    private Date arrivalTime;
    private String totalPrice;

    public ReservationDetail(String reservationSerialNumber)
    {
        super(reservationSerialNumber);
    }

    public ReservationDetail(Collection<AccountDetail> passengers, String departurePort, String destinationPort, Date departureTime, Date arrivalTime, Collection<AbstractVehicle> vehicles, String totalPrice, String reservationSerialNumber)
    {
        super(reservationSerialNumber);
        this.passengers = passengers;
        this.departurePort = departurePort;
        this.destinationPort = destinationPort;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.vehicles = vehicles;
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

    public Collection<AbstractVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<AbstractVehicle> vehicles) {
        this.vehicles = vehicles;
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
