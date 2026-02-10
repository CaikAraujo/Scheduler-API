package com.github.caikaraujo.scheduler_api.controller;


import com.github.caikaraujo.scheduler_api.model.Appointment;
import com.github.caikaraujo.scheduler_api.service.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping()
    public Appointment save(@Valid @RequestBody Appointment appointment){
        return service.createAppointment(appointment);
    }
}
