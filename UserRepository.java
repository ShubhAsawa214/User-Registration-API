package com.User_Registration_API.User.Registration.API.Repository;

import com.User_Registration_API.User.Registration.API.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
