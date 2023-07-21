package com.interview.test.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="Phone_Numbers")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PhoneNumber {
    @Id
    @Column(name = "Phone_Number")
    @GenericGenerator(name = "phngen111", strategy = "increment")
    @GeneratedValue(generator = "phngen111")
private Long phone;
    @Column(name = "number_Type")
private String numberType;
}
