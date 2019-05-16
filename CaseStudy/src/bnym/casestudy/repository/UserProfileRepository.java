package bnym.casestudy.repository;

import org.springframework.data.repository.CrudRepository;

import bnym.casestudy.entity.UserProfile;

public interface UserProfileRepository extends CrudRepository<UserProfile, String>{

}
