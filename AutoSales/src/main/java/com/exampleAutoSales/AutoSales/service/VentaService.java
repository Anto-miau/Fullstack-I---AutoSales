package com.exampleAutoSales.AutoSales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleAutoSales.AutoSales.model.Venta;
import com.exampleAutoSales.AutoSales.repository.VentaRepository;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getVentas() {
        return ventaRepository.obtenerVentas();
    }

    public Venta saveVenta(Venta venta) {
        return ventaRepository.guardar(venta);
    }

    /*     // sacamos equipaje y colocamos string
    public String saveEquipaje(Equipaje equipaje) {
    // primero colocar o llamar a la validacion o metodo
    String resultado = equipajeRepository.restriccion(equipaje);

    if ("no".equals(resultado)) {
      // if return no en la validacion o metodo del repository,
      // retornamos un mensaje de limite.
      return "Se ha alcanzado el límite de capacidad (500 kg). No se puede registrar más equipaje.";
    }
        equipajeRepository.guardar(equipaje);
        return "Equipaje registrado correctamente.";
    }*/
    

    public Venta updateVenta(Venta venta) {
        return ventaRepository.actualizar(venta);
    }

    // public string para devolver mensaje
    public String deleteVenta(Integer id) {
        ventaRepository.eliminar(id);
        return "Venta eliminado";
    }

    public Venta getVenta(Integer id) {
        return ventaRepository.buscarPorId(id);
    }
}
