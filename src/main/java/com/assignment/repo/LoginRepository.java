package com.assignment.repo;

import com.assignment.entity.LoginEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<LoginEntity,String>{
	
	LoginEntity findOneByUserIdAndPassword(String userId, String password);
	
}
