package com.interview.test.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GenericGenerator(name = "usergen111", strategy = "increment")
    @GeneratedValue(generator = "usergen111")
    private Long userId;
    @Column
    private String firstName;
    @OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    @JoinColumn(name = "unid")
    private List<PhoneNumber>  phones;

}
