package com.exampleAutoSales.AutoSales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleAutoSales.AutoSales.model.Venta;
import com.exampleAutoSales.AutoSales.service.VentaService;

@RestController
@RequestMapping("api/v1/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> listaVentas(){
        return ventaService.getVentas();
    }

    // le cambié "equipaje" a String para que devuelva el mensaje del service

    @PostMapping
    public Venta agregarVenta(@RequestBody Venta venta){
        return ventaService.saveVenta(venta);
    }

    @GetMapping("{id}")
    public Venta buscarVenta(@PathVariable Integer id){
        return ventaService.getVenta(id);
    }

    @PutMapping("{id}")
    public Venta actualizarVenta(@PathVariable Integer id, @RequestBody Venta venta){
        return ventaService.updateVenta(venta);
    }

    @DeleteMapping("{id}")
    public String eliminarEquipaje(@PathVariable Integer id){
        return ventaService.deleteVenta(id);
    }
    @GetMapping("/comisiones/{rut}")
    public int totalComisiones(@PathVariable String rut) {
        return ventaService.calcularTotalComisiones(rut);
    }

    @GetMapping("/reporte/{rut}")
    public String reporte(@PathVariable String rut) {
        return ventaService.reporteDesempeno(rut);
    }
}
