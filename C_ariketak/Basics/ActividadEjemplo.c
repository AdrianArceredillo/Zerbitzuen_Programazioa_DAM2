// Libro Garceta (pág. 19) - ACTIVIDAD 1.1
// Realiza un programa en C que cree un proceso (tendremos 2 procesos uno padre y otro hijo).
// El programa definirá una variable entera y le dará el valor 6. El proceso padre incrementará
// dicho valor en 5 y el hijo restará 5. Se deben mostrar los valores en pantalla. A continuación se
// muestra un ejemplo de la ejecución:

#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
void main()
{
    int aldagaia = 6;

    pid_t pid;
    pid = fork();
    if (pid == -1) // Ha ocurrido un error
    {
        printf("No se ha podido crear el proceso hijo,exit (-1)");
    }
    if (pid == 0) // Nos encontramos en Proceso hijo
    {
        printf("Valor inicial de la variable: %d\n", aldagaia);
        aldagaia = aldagaia - 5;
        printf("Variable en Procso Hijo: %d\n", aldagaia);
    }
    else // Nos encontramos en Proceso padre
    {
        wait(NULL);
        aldagaia = aldagaia + 5;
        printf("Variable en Procso Padre: %d\n", aldagaia);
    }
    // printf("Bye\n");
    exit(0);
}

// https://www.geeksforgeeks.org/wait-system-call-c/