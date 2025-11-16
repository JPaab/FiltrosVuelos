# Proagrama para gestionar Vuelos — Java

Programa que permite filtrar listas de vuelos según diferentes criterios de búsqueda que pueden ser vistos en la terminal.

## 📁 Estructura

```
FiltroVuelos
 ├─ Main.java                         # Lista de vuelos de prueba, secciones y tabla formateada para listar los vuelos.
 ├─ entities
 │   └─ Vuelo.java                    # Entidad Vuelo, Getters y constructores de los datos.
 ├─ utils
 │   ├─ ColorUtils.java               # Colores ANSI para la estetica al usar el programa desde la Terminal.
 │   └─ VueloUtils.java               # Clase utilitaria para los distintos filtros.
```

---

## 🦜 Entidad "Vuelo"

Campos principales:

* `id` (`Int`)
* `nombreVuelo`, `empresa`, `lugarSalida`, `lugarLlegada`, `fechaSalida`, `fechaLlegada`

---
