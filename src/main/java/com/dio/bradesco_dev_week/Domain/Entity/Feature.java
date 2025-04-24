package com.dio.bradesco_dev_week.Domain.Entity;

import com.dio.bradesco_dev_week.Domain.Entity.Generic.GenericItem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_feature")
public class Feature extends GenericItem {
}
