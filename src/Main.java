import entities.Vuelo;
import utils.ColorUtils;
import utils.VueloUtils;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final LocalDate FECHA_INICIO = LocalDate.of(2025, 5, 1);
    private static final LocalDate FECHA_FIN = LocalDate.of(2025, 6, 30);

    public static void main(String[] args) {
        List<Vuelo> vuelos = crearVuelosDePrueba();

        System.out.println(ColorUtils.ROJO.pintar(ColorUtils.BOLD.pintar("\n ➜ LISTA COMPLETA DE VUELOS \n ")));
        imprimirVuelos(vuelos);

        System.out.println(ColorUtils.ROJO.pintar(ColorUtils.BOLD.pintar("\n ➜ PARÁMETROS DEL FILTRO \n ")));
        System.out.println(ColorUtils.AZUL.pintar("Búsqueda desde:") + ColorUtils.ROJO.pintar(ColorUtils.BOLD.pintar(" " + FECHA_INICIO)));
        System.out.println(ColorUtils.AZUL.pintar("Hasta:") + ColorUtils.ROJO.pintar(ColorUtils.BOLD.pintar(" " + FECHA_FIN)));

        System.out.println(ColorUtils.ROJO.pintar(ColorUtils.BOLD.pintar("\n ➜ VUELOS FILTRADOS \n ")));
        List<Vuelo> vuelosFiltrados = VueloUtils.filtrarPorFechas(vuelos, FECHA_INICIO, FECHA_FIN);
        imprimirVuelos(vuelosFiltrados);
    }

    private static List<Vuelo> crearVuelosDePrueba() {
        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "Buenos Aires",
                LocalDate.of(2025,4,15), LocalDate.of(2025, 5, 6)));

        vuelos.add(new Vuelo(2, "H002-V", "Air France", "Madrid", "Paris",
                LocalDate.of(2025,5,20), LocalDate.of(2025, 5, 20)));

        vuelos.add(new Vuelo(3, "H003-V", "Lufthansa", "Barcelona", "Berlín",
                LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 1)));

        vuelos.add(new Vuelo(4, "H004-V", "Iberia", "Madrid", "New York",
                LocalDate.of(2025, 6, 15), LocalDate.of(2025, 6, 15)));

        vuelos.add(new Vuelo(5, "H005-V", "Turkish Airlines", "Madrid", "Estambul",
                LocalDate.of(2025, 7, 2), LocalDate.of(2025, 7, 3)));

        vuelos.add(new Vuelo(6, "H006-V", "American Airlines", "Barcelona", "Miami",
                LocalDate.of(2025, 7, 20), LocalDate.of(2025, 7, 20)));

        vuelos.add(new Vuelo(7, "H007-V", "LATAM", "Madrid", "Santiago",
                LocalDate.of(2025, 5, 10), LocalDate.of(2025, 5, 11)));

        vuelos.add(new Vuelo(8, "H008-V", "Ryanair", "Barcelona", "Roma",
                LocalDate.of(2025, 3, 28), LocalDate.of(2025, 3, 28)));

        vuelos.add(new Vuelo(9, "H009-V", "Vueling", "Madrid", "Lisboa",
                LocalDate.of(2025, 6, 23), LocalDate.of(2025, 6, 23)));

        vuelos.add(new Vuelo(10, "H010-V", "Air Europa", "Medellín", "Madrid",
                LocalDate.of(2025, 6, 26), LocalDate.of(2025, 6, 26)));

        vuelos.add(new Vuelo(11, "H011-V", "Iberia", "Madrid", "Turquia",
                LocalDate.of(2025, 6, 21), LocalDate.of(2025, 6, 21)));
        return vuelos;
    }

    private static void imprimirVuelos(List<Vuelo> vuelos) {
        if (vuelos.isEmpty()) {
            System.out.println(ColorUtils.ROJO.pintar("No hay vuelos que coincidan con el criterio de búsqueda."));
        }
        String formato = ""
                + "%s%-3s%s  "    // ID
                + "%s%-8s%s  "    // Vuelo
                + "%s%-18s%s "    // Empresa
                + "%s%-12s%s "    // Salida
                + "%s%-15s%s "    // Llegada
                + "%s%-12s%s "    // F. Salida
                + "%s%-12s%s%n";  // F. Llegada

        System.out.printf(
                formato,
                ColorUtils.AMARILLO, "ID",          ColorUtils.RESET,
                ColorUtils.AMARILLO, "Vuelo",       ColorUtils.RESET,
                ColorUtils.AMARILLO, "Empresa",     ColorUtils.RESET,
                ColorUtils.AMARILLO, "Salida",      ColorUtils.RESET,
                ColorUtils.AMARILLO, "Llegada",     ColorUtils.RESET,
                ColorUtils.AMARILLO, "F. Salida*",   ColorUtils.RESET,
                ColorUtils.AMARILLO, "F. Llegada",  ColorUtils.RESET
        );


        System.out.println(ColorUtils.AMARILLO.pintar("-------------------------------------------------------------------------------------"));

        for (Vuelo v : vuelos) {
            System.out.printf(
                    formato,
                    ColorUtils.AZUL, String.valueOf(v.getId()), ColorUtils.RESET,
                    ColorUtils.VERDE,v.getNombreVuelo(), ColorUtils.RESET,
                    ColorUtils.AZUL, v.getEmpresa(), ColorUtils.RESET,
                    ColorUtils.AZUL, v.getLugarSalida(), ColorUtils.RESET,
                    ColorUtils.AZUL, v.getLugarLlegada(), ColorUtils.RESET,
                    ColorUtils.AZUL, String.valueOf(v.getFechaSalida()), ColorUtils.RESET,
                    ColorUtils.AZUL, String.valueOf(v.getFechaLlegada()), ColorUtils.RESET
            );
            }
        }
    }