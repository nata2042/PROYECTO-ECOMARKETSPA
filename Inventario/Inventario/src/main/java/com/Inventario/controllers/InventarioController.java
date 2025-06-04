package com.Inventario.controller;

import com.Inventario.dto.InventarioDTO;
import com.Inventario.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<InventarioDTO> listar() {
        return inventarioService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventarioDTO> obtener(@PathVariable Long id) {
        InventarioDTO dto = inventarioService.obtenerPorId(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public InventarioDTO crear(@RequestBody InventarioDTO dto) {
        return inventarioService.crear(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InventarioDTO> actualizar(@PathVariable Long id, @RequestBody InventarioDTO dto) {
        InventarioDTO actualizado = inventarioService.actualizar(id, dto);
        return actualizado != null ? ResponseEntity.ok(actualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        inventarioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
