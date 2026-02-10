package com.github.caikaraujo.scheduler_api.service;


import com.github.caikaraujo.scheduler_api.model.Appointment;
import com.github.caikaraujo.scheduler_api.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public Appointment createAppointment(Appointment appointment){
        return repository.save(appointment);
    }


}
