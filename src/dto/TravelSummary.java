package dto;

import java.io.Serializable;
import java.util.Collection;


public class TravelSummary extends AbstractTravel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Collection<AccountSummary> passengers;
    private Collection<AbstractVehicle> vehicles;
    private long trafficSummaryId;
    private PriceDTO price;
    private double totalPrice;


    
    public TravelSummary(long id)
    {
        super(id);
    }

    public TravelSummary(long id, Collection<AccountSummary> passengers, Collection<AbstractVehicle> vehicles, long trafficSummaryId, double totalPrice)
    {
        super(id);
        this.passengers = passengers;
        this.vehicles = vehicles;
        this.trafficSummaryId = trafficSummaryId;
        this.totalPrice = totalPrice;
    }

    public Collection<AccountSummary> getPassengers() {
        return passengers;
    }

    public void setPassengers(Collection<AccountSummary> passengers) {
        this.passengers = passengers;
    }

    public Collection<AbstractVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<AbstractVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public long getTrafficSummaryId() {
        return trafficSummaryId;
    }

    public void setTrafficSummaryId(long trafficSummaryId) {
        this.trafficSummaryId = trafficSummaryId;
    }

    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
