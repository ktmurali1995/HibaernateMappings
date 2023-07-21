package com.interview.test.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    @Id
    @GenericGenerator(name = "gen1", strategy = "increment")
    @GeneratedValue(generator = "gen1")
    private Long cusId;

    @Column
    private String cusName;
    @Column
    private String Address;

    @Column
    private Long phoneNumber;

    @ManyToOne(targetEntity = Account.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "accId",referencedColumnName = "accId")
    private Account account;
}
