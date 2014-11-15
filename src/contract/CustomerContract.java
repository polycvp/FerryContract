/*
 * This class contains the methods that need to be implemented to connect the frontend and backend of the ferry application
    Provide javadoc descriptions to each interface method
    Define necessary Data Transfer Objects (dto) and Exception Transfer Objects (eto) for each method in the specific packages
 */

package contract;

import dto.*;
import eto.*;
import java.util.Collection;

/**
 *
 * @author Group F
 */
public interface CustomerContract {
    
    /**
     * Gets a complete timetable of ferry traffic according to the departure and destination port and departure time
     * @param traficDetail
     * @return 
     * @throws InvalidRouteException,NoFerriesFoundException
     */
    public Collection<TrafficSummary> getTrafficInformation(TrafficDetail traficDetail) throws InvalidRouteException,NoFerriesFoundException;
    
    /**
     * Gets all the information required for making a reservation for the users review
     * @param scheduleID
     * @return 
     * @throws NoScheduleException 
     */
    public TravelSummary getTravelerDetails(TravelDetail travelDetail) throws NoScheduleException;
    
    /**
     * Makes a reservation after the user has approved all the details, including the price, of his travel
     * @param resDetail
     * @return 
     * @throws NoSuchReservationException
     */
    public ReservationSummary makeReservation(ReservationDetail resDetail) throws NoSuchReservationException;
    
    /**
     * checks weather a user is a resident and entitled to special discounts
     */
    public void isUserResident(AccountDTO accDTO);
    
    /**
     * submits the necessary information to create a user account and returns a summary as confirmation
     * @param accDetail
     * @return 
     */
    public AccountSummary makeAccount(AccountDetail accDetail);
}
