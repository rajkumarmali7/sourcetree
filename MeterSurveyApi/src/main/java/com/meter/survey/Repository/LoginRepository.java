package com.meter.survey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.meter.survey.Entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long>{


	@Query(value= "SELECT * FROM Login o WHERE o.username=:username AND o.password=:password AND o.mobileno=:mobileno AND (o.status=1 OR o.status=0)", nativeQuery = true)
	Login findByUsernameAndPasswordmobile(@Param("username")String username,@Param("password") String password,@Param("mobileno") String mobileno);



}

