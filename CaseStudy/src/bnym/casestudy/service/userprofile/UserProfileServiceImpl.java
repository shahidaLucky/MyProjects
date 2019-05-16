package bnym.casestudy.service.userprofile;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entity.UserProfile;
import bnym.casestudy.repository.UserProfileRepository;

@Service
@Transactional
public class UserProfileServiceImpl implements UserProfileService {
	
	@Autowired
	UserProfileRepository repository;

	@Override
	public boolean saveUserProfile(UserProfile userProfile) {
		try {
			repository.save(userProfile);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

}
