/*
 * This class contains the methods that need to be implemented to connect the frontend and backend of the ferry application
    Provide javadoc descriptions to each interface method
    Define necessary Data Transfer Objects (dto) and Exception Transfer Objects (eto) for each method in the specific packages
 */

package contract;

import dto.*;
import eto.*;

/**
 *
 * @author Group F
 */
public interface CustomerContract {
    /**
     * 
     * @param scheduleID
     * @return
     * @throws NoScheduleException 
     */
    public TravelSummary getTravelerDetails(TravelDetail travelDetail) throws NoScheduleException;
    
    public ReservationDTO makeReservation(TravelSummary travelSummary);
    
    public void getTrafficInformation();
    
    public void isUserResident();
    
    public AccountSummary makeAccount(AccountDetail accDetail);
}
