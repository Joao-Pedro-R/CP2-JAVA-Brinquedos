package com.empresa.brinquedos.controller;

import com.empresa.brinquedos.model.Brinquedo;
import com.empresa.brinquedos.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public List<Brinquedo> listarBrinquedos() {
        return brinquedoService.listarBrinquedos();
    }

    @GetMapping("/{id}")
    public Optional<Brinquedo> buscarBrinquedo(@PathVariable Long id) {
        return brinquedoService.buscarBrinquedo(id);
    }

    @PostMapping
    public Brinquedo adicionarBrinquedo(@RequestBody Brinquedo brinquedo) {
        return brinquedoService.salvarBrinquedo(brinquedo);
    }
}

