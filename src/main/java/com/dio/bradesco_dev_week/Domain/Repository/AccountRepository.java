package com.dio.bradesco_dev_week.Domain.Repository;

import com.dio.bradesco_dev_week.Domain.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
