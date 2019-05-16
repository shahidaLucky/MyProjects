
package bnym.casestudy.service.login;
import bnym.casestudy.entity.UserProfile;

public interface UserDetailsDao{
	UserProfile findUserProfileByUsername(String username);
}
