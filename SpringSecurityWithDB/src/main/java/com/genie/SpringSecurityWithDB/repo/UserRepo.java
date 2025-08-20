package com.genie.SpringSecurityWithDB.repo;

import com.genie.SpringSecurityWithDB.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo  extends JpaRepository<UserEntity ,String>
{
          Optional<UserEntity> findByEmail(String email);
}
