package com.interview.test.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {

    @Id
    @GenericGenerator(name = "gen1", strategy = "increment")
    @GeneratedValue(generator = "gen1")
    private Long accId;


    @Column
    private String accountType;

    @Column
    private String accName;

}
