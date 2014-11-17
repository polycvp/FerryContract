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
    
    private Collection<AccountSummary> passengers;
    private Collection<AbstractVehicle> vehicles;
    private TrafficSummary trafficSummary;

    public TravelDetail(long id)
    {
        super(id);
    }

    public TravelDetail(long id, Collection<AccountSummary> passengers, Collection<AbstractVehicle> vehicles, TrafficSummary trafficSummary)
    {
        super(id);
        this.passengers = passengers;
        this.vehicles = vehicles;
        this.trafficSummary = trafficSummary;
    }

    public Collection<AccountSummary> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(Collection<AccountSummary> passengers)
    {
        this.passengers = passengers;
    }

    public Collection<AbstractVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<AbstractVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public TrafficSummary getTrafficSummary() {
        return trafficSummary;
    }

    public void setTrafficSummary(TrafficSummary trafficSummary) {
        this.trafficSummary = trafficSummary;
    }
}
