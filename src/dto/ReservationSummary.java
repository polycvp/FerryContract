package dto;

import java.io.Serializable;

/**
 *
 * @author Paul
 */
public class ReservationSummary extends AbstractReservation implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private long TravelSummaryId;
    private double totalPrice;

    public ReservationSummary(String reservationSerialNumber)
    {
        super(reservationSerialNumber);
    }

    public ReservationSummary(String reservationSerialNumber, long TravelSummaryId, double totalPrice)
    {
        super(reservationSerialNumber);
        this.TravelSummaryId = TravelSummaryId;
        this.totalPrice = totalPrice;
    }

    public long getTravelSummaryId()
    {
        return TravelSummaryId;
    }

    public void setTravelSummaryId(long TravelSummaryId)
    {
        this.TravelSummaryId = TravelSummaryId;
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
