package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Clase utilitaria que uso para crear los filtros.

public class VueloUtils {
    public static List<Vuelo> filtrarPorFechas(List<Vuelo> vuelos, LocalDate fechaInicio, LocalDate fechaFin) {
        return vuelos.stream()
                .filter(vuelo -> {
                    LocalDate salida = vuelo.getFechaSalida();
                    if (fechaInicio == null && fechaFin == null) {
                        return true;
                    } else if (fechaInicio == null) {
                        return !salida.isAfter(fechaFin);
                    } else if (fechaFin == null) {
                        return !salida.isBefore(fechaInicio);
                    } else {
                        boolean noAntesDeInicio = !salida.isBefore(fechaInicio);
                        boolean noDespuesDeFin = !salida.isAfter(fechaFin);
                        return noAntesDeInicio && noDespuesDeFin;
                    }
                })
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .collect(Collectors.toList());
    }
}
