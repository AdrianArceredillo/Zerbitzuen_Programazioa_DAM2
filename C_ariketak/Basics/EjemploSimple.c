#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
// ABUELO-HIJO-NIETO
void main()
{
    pid_t pid;
    pid = fork();
    if (pid == -1) // Ha ocurrido un error
    {
        printf("No se ha podido crear el proceso hijo,exit (-1)");
    }
    if (pid == 0) // Nos encontramos en Proceso hijo
    {
        printf("HC: hello from child\n");
    }
    else // Nos encontramos en Proceso padre
    {
        printf("HP: hello from parent\n");
        wait(NULL);
        printf("CT: child has terminated\n");
    }
    printf("Bye\n");
    exit(0);
}

// https://www.geeksforgeeks.org/wait-system-call-c/