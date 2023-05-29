package com.jpcchaves.ecommerce.repository;

import com.jpcchaves.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
