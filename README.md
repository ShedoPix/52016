INSTALACIÓN

Para instalar este proyecto se debe clonar el repositorio ejecutando en una ventana de comandos (CMD, POWERSHELL o terminal en Linux) los siguientes comandos en orden:

git clone https://github.com/ShedoPix/52016.git
cd 52016
code .

CÓMO UTILIZAR

1. Abrir la carpeta "ssl-antlr-parcial-analizador" en Visual Studio Code

![image](https://github.com/user-attachments/assets/0a0a72c7-d4b6-42fe-9396-55754a9f36b0)

3. Copiar el texto de alguno de los ejemplos "input-correcto" o "input-incorrecto" (O alternativamente escribir su propio input) y pegarlo dentro del archivo input.txt

![image](https://github.com/user-attachments/assets/26cfef9e-27aa-45d7-bac4-d3c3608498e5)

4. Para realizar el análisis léxico, el análisis sintáctico, crear la tabla de tokens y convertir a código en JavaScript el input dado, primero se debe ejecutar en la terminal de Visual Studio Code el siguiente comando:
cd ssl-antlr-parcial-analizador
Luego, para realizar el análisis, sólo se debe ejecutar el comando:
node main.js

![image](https://github.com/user-attachments/assets/c9b65b16-e7c9-41b7-807f-3a86193573b2)

  
5. Para ver el árbol de análisis sintáctico del input dado, presionar F5
