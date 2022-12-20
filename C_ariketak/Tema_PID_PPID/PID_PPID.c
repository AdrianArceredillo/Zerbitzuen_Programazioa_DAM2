#include <stdio.h>
#include <unistd.h>
// pid_t fork(void);


// pid_t getpid(void);
// pid_t getppid (void) ;

void main(void)
{
    pid_t id_pactual, id_padre;
    id_pactual = getpid();
    id_padre = getppid();
    printf("PID de este proceso: %d\n", id_pactual);
    printf("PID del proceso padre: %d\n", id_padre);
}


//ver lista de procesos (PID & PPID): "ps -AF"