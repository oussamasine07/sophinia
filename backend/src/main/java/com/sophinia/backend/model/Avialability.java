package com.sophinia.backend.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "availabilities")
public class Avialability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "from")
    private LocalDate from;

    @Column(name = "to")
    private LocalDate to;

    public Avialability () {}

    // TODO add relationships

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }
}
