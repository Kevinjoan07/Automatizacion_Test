## Automatizacion_Test

Se realiza Automatizacion de la Creacion, Busqueda, Actualizacion y Eliminacion de un usuario mediante  Apis en la pagina [petStoreSwagger](https://petstore.swagger.io/), todo con [Karate](https://github.com/karatelabs/karate), [Gradle](https://gradle.org/), [Java](https://www.java.com/es/) y  [Cucumber](https://cucumber.io/)


## Ejecucion

Para ejecutar y obtener el reporte debemos ubicarnos en la carpeta del proyecto y abrir el `CMD` para ejecutar el siguiente comando

```yml
    gradle clean test 
```

Al momento de ejecutar el proyecto y obtener el reporte debemos ubicarnos en la carpeta del proyecto en la ruta (este es el reporte nativo del framework Karate)
```yml
    <ProyectoName>\target\karate-reports\karate-summary.html
```

Tambien luego de ejecutar el comando, este codigo contiene  una funcion para generar un reporte un poco mas agradable y profecional el cual se ubica en la siguiente ruta 

```yml
   <ProyectoName>\build\cucumber-html-reports\overview-features.html
```


