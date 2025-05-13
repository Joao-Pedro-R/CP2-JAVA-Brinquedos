package com.empresa.brinquedos.service;

import com.empresa.brinquedos.model.Brinquedo;
import com.empresa.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    public List<Brinquedo> listarBrinquedos() {
        return brinquedoRepository.findAll();
    }

    public Optional<Brinquedo> buscarBrinquedo(Long id) {
        return brinquedoRepository.findById(id);
    }

    public Brinquedo salvarBrinquedo(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }
}
