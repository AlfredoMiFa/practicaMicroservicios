# practicaMicroservicios
Practica de microservicios

Url del repositorio: https://github.com/AlfredoMiFa/practicaMicroservicios
1.- Clonar el repositorio con el siguiente comando: git clone laUrl
2.- Abrir spring tools suite en su versión 3
3.- Buscar e importar los proyecto(s) BancoAsincrono, BancoAsincronocola1 y BancoAsincronocola2 como proyectos maven.
4.- Compilar los proyectos, click derecho sobre cada uno y maven-> update proyect.
5.- Abrir las clases BancoAsincronoApplication.java, BancoAsincronocola1Application.java y BancoAsincronocola2Application2, dar click derecho en cada una de ellas y ejecutar como spring boot application.
6.- Para poder ejecutar de manera correcta deberá haber instalado y configurado rabbitmq en su ordenador.
7.- Enviar una petición a la url http://localhost:8083, este deberá ser una método POST con los parámetros de name y email, estos deben ir en formato JSON, ejemplo, {
    "name":"hola",
    "email":"algo@algo.com"
}
8.- Para ver el correcto funcionamiento deberá acceder a su rabbitmq de manera local, la url por lo general es: http://localhost:8081
9.- Para poder acceder le pedirá que use unas credenciales para autentificarse, el usuario y contraseña por lo regular es guest.
10.- Acceder al apartado de Queue, ahí verá las colas que han sido creadas.
11.- Para poder ver la petición que envío en el paso 7, debe elegir el apartado de Exchange y el nombre de su cola.
