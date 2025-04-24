package com.dio.bradesco_dev_week.Domain.Repository;

import com.dio.bradesco_dev_week.Domain.Entity.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature,Long> {
}
