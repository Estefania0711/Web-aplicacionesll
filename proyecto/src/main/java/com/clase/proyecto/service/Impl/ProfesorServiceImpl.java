package com.clase.proyecto.service.Impl;

import com.clase.proyecto.model.Profesor;
import com.clase.proyecto.repository.ProfesorRepository;
import com.clase.proyecto.service.ProfesorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.lang.*;

import java.util.Optional;

@Service
public class ProfesorServiceImpl implements ProfesorService {
    private final ProfesorRepository profesorRepository;

    public ProfesorServiceImpl(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public Page<Profesor> findAll(Pageable pageable) {
        return profesorRepository.findAll(pageable);
    }

    @Override
    public Optional<Profesor> findById(Integer id) {
        return profesorRepository.findById(id);
    }

    @Override
    public Profesor create(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor update(Integer id, Profesor profesor) {
        profesor.setId_profesor(id);
        return profesorRepository.save(profesor);
    }

    @Override
    public void deleteById(Integer id) {
        profesorRepository.deleteById(id);
    }
}
