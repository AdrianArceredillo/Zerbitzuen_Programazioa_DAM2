// Libro Garceta (pág. 22 y 23)

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int fd[2]; //(escritura/lectura = 2)
    pid_t pid;
    char saludoPadre[] = "Buenos dias h.ijo.\0";
    char buffer[80];
    pipe(fd);     // creo pipe
    pid = fork(); // creo proceso

    /*
    El pipe se hace antes del fork, para que el hij herede el mismo pipe.
    De lo contrario, cada uno tendría un pipe diferente
    */

    pid = fork(); // se crea el proceso hijo
    switch (pid)
    {
    case -1: // ERROR
        printf("NO SE HA PODIDO CREAR HIJO...");
        exit(-1);
        break;
    case 0:                                  // HIJO RECIVE
        close(fd[1]);                        // cierra el descriptor de entrada
        read(fd[0], buffer, sizeof(buffer)); // leo el pipe
        printf("\tEl HIJO recibe algo del pipe: %s\n", buffer);
        break;
    default: // PADRE ENVÍA
        close(fd[0]);
        write(fd[1], saludoPadre, strlen(saludoPadre)); // escribo en pipe
        wait(NULL);                                     // espera que finalice proceso hijo
        printf("El PADRE ENVIA MENSAJE AL HIJO...\n");
        wait(NULL); // espero al proceso hijo
        break;
    }
}