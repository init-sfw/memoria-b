memoria-b
=========

Back-end del proyecto Memoria

## Descripción

Nueva versión del backend de **Memoria**, formado desde una aplicación grails que provee servicios en formato JSON.

Las consultas se hacen contra la siguiente url: http://107.170.16.162:8088/memoria-backend/MEvent/filter
Con los siguientes parámetros posibles:

- **fromDate:** Fecha de inicio del período a consultar [Requerido]
- **toDate:** Fecha de fin del período a consultar [Requerido]
- **view:** Valor del zoom del que se desea consultar (desde 0 a 4) [Requerido]
- **category:** El id de la categoría por la cual se queire filtrar [Múltiple]
- **country:** El id del país por el que se quiere filtrar [Múltiple]

Ejemplos:

- http://107.170.16.162:8088/memoria-backend/MEvent/filter?fromDate=01/01/1800&toDate=01/01/1900&view=2
- http://107.170.16.162:8088/memoria-backend/MEvent/filter?fromDate=01/01/1800&toDate=01/01/1900&view=2&categories=2
- http://107.170.16.162:8088/memoria-backend/MEvent/filter?fromDate=01/01/1800&toDate=01/01/1900&view=2&categories=2&country=14&country78
