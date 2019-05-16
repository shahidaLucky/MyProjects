
package bnym.casestudy.service.login;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import bnym.casestudy.entity.UserProfile;
 
@Repository
public class UserDetailsDaoImp implements UserDetailsDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public UserProfile findUserProfileByUsername(String username) {
		return sessionFactory.getCurrentSession().get(UserProfile.class, username);
	}
}
