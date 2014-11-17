package dto;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Paul
 */
public class TravelSummary extends AbstractTravel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Collection<AccountDetail> passengers;
    private CarDTO car;
    private LorryDTO lorry;
    private LargeMachineryDTO largeMachinery;
    private long trafficSummaryId;
    private PriceVehicleDTO price;


    
    public TravelSummary(long id)
    {
        super(id);
    }

    public TravelSummary(long id, Collection<AccountDetail> passengers, CarDTO car, long trafficSummaryId)
    {
        super(id);
        this.passengers = passengers;
        this.car = car;
        this.trafficSummaryId = trafficSummaryId;
    }

    public TravelSummary(long id, Collection<AccountDetail> passengers, LorryDTO lorry, long trafficSummaryId)
    {
        super(id);
        this.passengers = passengers;
        this.lorry = lorry;
        this.trafficSummaryId = trafficSummaryId;
    }

    public TravelSummary(long id, Collection<AccountDetail> passengers, LargeMachineryDTO largeMachinery, long trafficSummaryId)
    {
        super(id);
        this.passengers = passengers;
        this.largeMachinery = largeMachinery;
        this.trafficSummaryId = trafficSummaryId;
    }

    public Collection<AccountDetail> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(Collection<AccountDetail> passengers)
    {
        this.passengers = passengers;
    }

    public CarDTO getCar()
    {
        return car;
    }

    public void setCar(CarDTO car)
    {
        this.car = car;
    }

    public LorryDTO getLorry()
    {
        return lorry;
    }

    public void setLorry(LorryDTO lorry)
    {
        this.lorry = lorry;
    }

    public LargeMachineryDTO getLargeMachinery()
    {
        return largeMachinery;
    }

    public void setLargeMachinery(LargeMachineryDTO largeMachinery)
    {
        this.largeMachinery = largeMachinery;
    }

    public long getTrafficSummaryId()
    {
        return trafficSummaryId;
    }

    public void setSelectedRoute(long trafficSummaryId)
    {
        this.trafficSummaryId = trafficSummaryId;
    }
    
    public PriceVehicleDTO getPrice()
    {
        return price;
    }

    public void setPrice(PriceVehicleDTO price)
    {
        this.price = price;
    }

}
