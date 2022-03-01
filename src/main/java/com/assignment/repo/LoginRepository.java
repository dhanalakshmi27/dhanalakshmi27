package com.assignment.repo;


public interface LoginRepository extends CrudRepository<LoginEntity,String>{

    LoginEntity findOneByUserIdAndPassword(String userId, String password);
	
}
