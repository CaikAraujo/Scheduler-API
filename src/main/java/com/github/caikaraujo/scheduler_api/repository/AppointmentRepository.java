package com.github.caikaraujo.scheduler_api.repository;

import com.github.caikaraujo.scheduler_api.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {}
