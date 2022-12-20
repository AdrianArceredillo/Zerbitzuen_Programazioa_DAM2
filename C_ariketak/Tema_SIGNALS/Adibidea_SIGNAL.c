#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>
/* gestión de señales en proceso HIJO */
void manejador(int segnal)
{
    printf("Hijo recibe señal.. %d\n", segnal);
}

int main()
{
    int pid_hijo;
    pid_hijo = fork(); // creamos hijo

    switch (pid_hijo)
    {
    case -1:
        printf("Error al crear el proceso hijo...\n");
        exit(-1);
    case 0:                         // HIJO
        signal(SIGUSR1, manejador); // MANEJADOR DE SEÑAL EN HIJO
        while (1)
        {
            pause();    //ESPERA HASTA QUE RECIBA UNA SEÑAL
        }
        printf("Semea bukatzera doa. ");
        break;
    default: // PADRE envia 2 señales
        printf("PID del hijo: %d\n", pid_hijo);
        sleep(1);
        kill(pid_hijo, SIGUSR1); // ENVIA SEÑAL AL HIJO
        sleep(1);
        kill(pid_hijo, SIGUSR1); // ENVIA SEÑAL AL HIJO
        sleep(1);
        kill(pid_hijo, SIGKILL); // ENVIA SEÑAL PARA MATAR AL HIJO
        sleep(1);
        break;
    }
    return 0;
}