package bnym.casestudy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entity.Apply;

@Repository
public interface ApplyRepository extends CrudRepository<Apply, Long>{

}
