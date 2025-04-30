package com.dio.bradesco_dev_week.Domain.Repository;

import com.dio.bradesco_dev_week.Domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    Boolean existsByAccountNumber(String accountNumber);
}
