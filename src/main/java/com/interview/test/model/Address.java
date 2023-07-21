package com.interview.test.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="ADDRESS")
@Getter
@Setter
public class Address {
    @Id
    @Column(name = "ADDRESS_ID")
    @GenericGenerator(name = "addressGen",strategy = "increment")
    @GeneratedValue(generator = "addressGen")
    private Integer id;

    @Column(name="DOORNUMBER")
    private String doorNumber;

    @Column(name="STREET")
    private String street;

    @Column(name="CITY")
    private String city;
}
