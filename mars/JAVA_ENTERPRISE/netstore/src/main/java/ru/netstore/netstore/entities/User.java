package ru.netstore.netstore.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Builder
@Data
@Table(name = "admin_info")
public class User {

    @Column(name = "login")
    private String login;
    @Column(name = "hashPassword")
    private String hashPassword;

}
