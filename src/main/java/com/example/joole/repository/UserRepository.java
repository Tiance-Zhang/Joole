package com.example.joole.repository;

import com.example.joole.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String > {

}
