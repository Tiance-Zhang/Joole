package com.example.joole.entity;
import java.sql.Timestamp;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TBL")

public class User {

//    @GeneratedValue
//    private int id;
    @Id
    private String user_name;
    private String role;
    //encoded password
    private String password;
    private Timestamp time_created;
    private Timestamp time_updated;

}