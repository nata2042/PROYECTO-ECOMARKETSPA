package com.Inventario.service;

import com.Inventario.dto.InventarioDTO;

import java.util.List;

public interface InventarioService {

    List<InventarioDTO> listar();

    InventarioDTO obtenerPorId(Long id);

    InventarioDTO crear(InventarioDTO dto);

    InventarioDTO actualizar(Long id, InventarioDTO dto);

    void eliminar(Long id);
}
