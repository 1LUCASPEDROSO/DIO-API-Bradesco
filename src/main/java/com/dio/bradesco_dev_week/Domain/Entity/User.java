package com.dio.bradesco_dev_week.Domain.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id", nullable = false)
    private Card card;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // cascade para caso deletar usuario deletar suas featires e featch type eager para buscar todas as feafures junto
    private List<Feature> features;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;
}
