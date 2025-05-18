### **INSTALACIÓN**

Para instalar este proyecto se debe clonar el repositorio ejecutando en una ventana de comandos (CMD, POWERSHELL o terminal en Linux) los siguientes comandos en orden (MUY IMPORTANTE SEGUIR BIEN ESTOS PASOS):
```
git clone https://github.com/ShedoPix/52016.git
```
```
cd 52016
```
```
cd ssl-antlr-parcial-analizador
```
```
code .
```
### **CÓMO UTILIZAR**

1. Tener abierto "ssl-antlr-parcial-analizador" en Visual Studio Code

![image](https://github.com/user-attachments/assets/c6fd2868-1110-4de1-b203-9d340c0892b4)

3. Copiar el texto de alguno de los ejemplos "input-correcto" o "input-incorrecto" (O alternativamente escribir su propio input) y pegarlo dentro del archivo input.txt

   Primero hay que hacer click en alguno de esos cuatro archivos .txt
   
![image](https://github.com/user-attachments/assets/064a7264-fcab-43a0-9b38-2b8e34dab5ba)

   Luego copiamos el texto del archivo

![image](https://github.com/user-attachments/assets/73505867-1b9a-42f4-a8e0-d5be78a54cc8)

   Por último lo pegamos en el archivo input.txt dentro del proyecto

![image](https://github.com/user-attachments/assets/9b0a3e07-c08d-4ab6-ae5d-dc76220ee434)

4. Para realizar el análisis léxico, el análisis sintáctico, crear la tabla de tokens y convertir a código en JavaScript el input dado, se debe ejecutar en la terminal de Visual Studio Code el siguiente comando:
    ```
    node main.js
    ```
![image](https://github.com/user-attachments/assets/d8d07e71-ae62-4978-92bf-420f022413fc)
  
5. Para ver el árbol de análisis sintáctico del input dado, presionar F5
