## Dojo Arquitectura

### Integrantes: 
- Santiago Barrera - CO
- Mathías Collazo - UY


### Descripción del proyecto:
Consiste en un gestor de biblioteca en el que se puede crear libros y consultar libros. Se usó como referencia Arquitectura Hexagonal.

### URLs públicas utilizadas:
- ec2-44-203-18-148.compute-1.amazonaws.com:8081
- ec2-44-203-18-148.compute-1.amazonaws.com:8082

### Instrucciones de uso:
Para ejecutar el docker del primer microservicio, es necesario ejecutar el siguiente comando: 
- ##### docker run -p 8081:8080 --name "nombre" collazomathias/dojo_first_microservice:latest 

![Alt text](https://imgur.com/dfnONKz.png)

En la siguiente imágen se muestra el microservicio funcionando correctamente.

![Alt text](https://imgur.com/07Hocfb.png)

Para ejecutar el docker del segundo microservicio, es necesario ejecutar el siguiente comando: 
- ##### docker run -p 8082:8080 --name "nombre" collazomathias/dojo_second_microservice:latest 

![Alt text](https://imgur.com/C5VuLzI.png)

En la siguiente imágen se muestra el microservicio funcionando correctamente, se utilizó postman para la prueba.

![Alt text](https://imgur.com/KKcUqfR.png)


