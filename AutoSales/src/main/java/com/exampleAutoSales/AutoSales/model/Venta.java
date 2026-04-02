package com.exampleAutoSales.AutoSales.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Venta {

    @NotNull
    private Integer id;
    @NotBlank(message = "no")
    private String rutEjecutivo;
    @NotBlank(message = "no")
    private String categoriaEjecutivo;
    @NotNull
    private Integer montoVehiculo;

}
