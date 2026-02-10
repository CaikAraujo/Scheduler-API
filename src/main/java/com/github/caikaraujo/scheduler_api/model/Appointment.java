package com.github.caikaraujo.scheduler_api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Client name is required!")
    private String clientName;

    @NotBlank(message = "Service type is required!")
    private String serviceType;

    @NotNull(message = "Date is required!")
    @Future(message = "Appointment must be in the future")
    private LocalDateTime dateTime;

    private LocalDateTime createdAt = LocalDateTime.now();
}
