package com.group24.hostelroommapping.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="booking")
public class Hostel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="phone_no")
    private long phoneNo;

    @Column(name="type_of_hostel")
    private String typeOfHostel;

    @Column(name="registration_no")
    private long registrationNo;

    @Column (name="room_no")
    private long roomNo;

//    @ManyToOne
//    @JoinColumn(name = "room_no")
//    @JsonBackReference
//    private HostelStatus hostelStatus;






}

