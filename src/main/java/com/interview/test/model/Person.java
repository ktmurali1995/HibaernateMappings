package com.interview.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name="PERSONDETAILS")
public class Person {
    @Id
    @GenericGenerator(name = "personGen",strategy = "increment")
    @GeneratedValue(generator = "personGen")
    private Long id;

    @Column(name="FIRSTNAME")
    private String firstName;

    @Column(name="LASTNAME")
    private String lasttName;
    @Column(name="AGE")
    private byte age;


    @OneToOne(cascade=CascadeType.ALL,targetEntity = Address.class)
    @JoinColumn(name="ADDRESSID",referencedColumnName = "ADDRESS_ID")
    private Address address;


}
