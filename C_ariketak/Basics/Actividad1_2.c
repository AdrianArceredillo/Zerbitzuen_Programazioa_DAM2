// Libro Garceta (pág. 22 y 23)

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int fd[2]; //(escritura/lectura = 2)
    pid_t pid;
    char saludoHijo[] = "Buenos dias padre.\0";
    char buffer[80];
    pipe(fd);     // creo pipe
    pid = fork(); // creo proceso


    pid = fork(); // se crea el proceso hijo
    switch (pid)
    {
    case -1: // ERROR
        printf("NO SE HA PODIDO CREAR HIJO...");
        exit(-1);
        break;
    case 0:                                  // HIJO RECIVE
        close(fd[0]);                       // cierra el descriptor de entrada
        write(fd[1], saludoHijo, strlen(saludoHijo)); // escribo en pipe
        
        // printf("\tEl HIJO envía algo del pipe: %s\n", buffer);
        printf("\n");
        printf("\tEl HIJO envía algo del pipe: \n");
        break;
    default: // PADRE RECIBE
        close(fd[1]);
        wait(NULL);                        // espera que finalice proceso hijo
        read (fd[0], buffer, sizeof (buffer)); //leo el pipe            
        printf("El PADRE recibe algo del pipe: %s\n",buffer);
        // wait(NULL); // espero al proceso hijo
        break;
    }
}