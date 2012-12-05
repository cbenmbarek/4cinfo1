package edu.espritCs.rakzaEJB.domain.management;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCs.rakzaEJB.entities.User;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
@LocalBean
public class ManagementServices implements ManagementServicesRemote, ManagementServicesLocal {

	@PersistenceContext
	EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public ManagementServices() {
        // TODO Auto-generated constructor stub
    	
    }


    
	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		entityManager.merge(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		entityManager.remove(user);
	}

	@Override
	public User getUserbyId(int id) {
		// TODO Auto-generated method stub
		//entityManager.find(arg0, arg1)
		return null;
	}

	@Override
	public List<User> getAllUserbyId() {
		// TODO Auto-generated method stub
		return null;
	}

}
