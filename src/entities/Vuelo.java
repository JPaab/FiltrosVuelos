package entities;

import utils.ColorUtils;

import java.time.LocalDate;

public class Vuelo {
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;

    public Vuelo(int id,
                 String nombreVuelo,
                 String empresa,
                 String lugarSalida,
                 String lugarLlegada,
                 LocalDate fechaSalida,
                 LocalDate fechaLlegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public int getId() {
        return id;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    @Override
    public String toString() {
        return
                " - " + ColorUtils.VERDE.pintar("ID del vuelo: ") + id + "\n"
                + " - " + ColorUtils.AZUL.pintar("Nombre del vuelo: ") + nombreVuelo + "\n"
                + " - " + ColorUtils.AZUL.pintar("Aerolineas: ") + empresa + "\n"
                + " - " + ColorUtils.AZUL.pintar("Lugar Salida: ") + lugarSalida + "\n"
                + " - " + ColorUtils.AZUL.pintar("Lugar Llegada: ") + lugarLlegada + "\n"
                + " - " + ColorUtils.AZUL.pintar("Fecha Salida: ") + fechaSalida + "\n"
                + " - " + ColorUtils.AZUL.pintar("Fecha Llegada: ") + fechaLlegada + "\n";
    }
}
