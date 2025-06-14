package com.sophinia.backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "appointment_date")
    private LocalDate appointmentDate;

}
