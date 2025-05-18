INSTALACIÓN

Para instalar este proyecto se debe clonar el repositorio ejecutando en una ventana de comandos (CMD, POWERSHELL o terminal en Linux) los siguientes comandos en orden:

git clone https://github.com/ShedoPix/52016.git

cd 52016

code .

CÓMO UTILIZAR

1. Abrir la carpeta "ssl-antlr-parcial-analizador" en Visual Studio Code

![image](https://github.com/user-attachments/assets/0a0a72c7-d4b6-42fe-9396-55754a9f36b0)

3. Copiar el texto de alguno de los ejemplos "input-correcto" o "input-incorrecto" (O alternativamente escribir su propio input) y pegarlo dentro del archivo input.txt

![image](https://github.com/user-attachments/assets/e0430268-7db2-473f-a9a3-defb157df558)

4. Para realizar el análisis léxico, el análisis sintáctico, crear la tabla de tokens y convertir a código en JavaScript el input dado, se debe ejecutar en la terminal de Visual Studio Code el siguiente comando:

    node main.js

![image](https://github.com/user-attachments/assets/d8d07e71-ae62-4978-92bf-420f022413fc)
  
5. Para ver el árbol de análisis sintáctico del input dado, presionar F5
