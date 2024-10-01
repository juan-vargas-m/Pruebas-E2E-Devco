# language: es

Característica: Filtros en Airbnb de estadias

@manual
  Escenario: Filtrar por Piscinas increíbles
    Dado que Juan busca un airbnb para "jardin, antioquia", por 5 días y para 2 "Adultos"
    Cuando Juan filtre por "Piscinas increíbles"
    Entonces Juan ve que los 1 primeros resultados deben tener "Piscina" en "Estacionamiento e instalaciones" en los servicios del detalle
