package com.dio.bradesco_dev_week.Domain.Repository;

import com.dio.bradesco_dev_week.Domain.Entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository  extends JpaRepository<Card,Long> {
}
