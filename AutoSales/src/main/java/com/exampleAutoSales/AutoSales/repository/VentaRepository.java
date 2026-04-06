package com.exampleAutoSales.AutoSales.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.exampleAutoSales.AutoSales.model.Venta;

@Repository
public class VentaRepository {
    private List <Venta> listaVentas = new ArrayList<>();

    //metodo permitir agregar, listar y eliminar productos, incluyendo nombre, precio y categoría. 

    //listar
    public List<Venta> obtenerVentas (){
        return listaVentas;
    }

//-----------------------------------------------------------------------
    public Venta buscarPorId(Integer id){
        for (Venta Venta : listaVentas){
            if (Venta.getId() == id){
                return Venta;
            }
        }
        return null;
    }
        
//--------------------------------------------------------------
    // Para otros casos o actividades si se pide la validacion para otros
    // metodos me sirve hacerlo separado

    //agregar
    public Venta guardar(Venta vent){
        listaVentas.add(vent);
        return vent;
    }

    /*public String restriccion(Consumo nuevoEquipaje) {
    int pesoTotal = 0;
    for (Equipaje equipaje : listaEquipajes) {
        pesoTotal += equipaje.getPeso();
    }

    if (pesoTotal + nuevoEquipaje.getPeso() > 500) {
        return "no";
    } else {
        return "chi";
    }

    }*/

//--------------------------------------------------------------------------------------
    //por si acaso

    public Venta actualizar(Venta vent){
        for(int i = 0; i < listaVentas.size(); i++){
            if(listaVentas.get(i).getId() == vent.getId()){
                listaVentas.set(i,vent);
                return vent;   
            }
        }
        return null;
    }
//-------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------

    public void eliminar(Integer id){
        Venta venta = buscarPorId(id);
        if (venta!=null){
            listaVentas.remove(venta);
        }
    }

//-----
}
