package com.dio.bradesco_dev_week.Domain.Repository;

import com.dio.bradesco_dev_week.Domain.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Long> {
}
