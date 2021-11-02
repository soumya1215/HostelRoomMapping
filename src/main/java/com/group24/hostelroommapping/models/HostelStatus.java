package com.group24.hostelroommapping.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="status")
public class HostelStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="bed_available")
    private long availableBed;

    @Column(name="features")
    private String feature;

    @Column(name="hostel_type")
    private  String hostelType;

    @Column(name = "room_no")
    private long roomNo;

//    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "status")
//    private List<Hostel> hostels= new ArrayList();

}
