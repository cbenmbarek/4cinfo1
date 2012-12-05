package edu.espritCs.rakzaEJB.domain.claimLifeCycle;

import java.util.List;

import javax.ejb.Local;

import edu.espritCs.rakzaEJB.entities.Claim;
import edu.espritCs.rakzaEJB.entities.User;

@Local
public interface LifeCycleServicesLocal {
	void createClaimByUser(Claim claim, User user);

	Boolean operationOnClaim(String refClaim, String newStatus);

	void createClaim(Claim claim);	
	

}
