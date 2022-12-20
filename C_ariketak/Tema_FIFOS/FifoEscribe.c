// fifoescribe.c
#include <stdio.h>
#include <stdlib.h>
// #include <sys/types.h>
// #include <sys/stat.h>
#include <fcntl.h>

#include <string.h>

int main(void)
{
    int fp;
    char buffer[10];
    // char saludo[] = "Un saludo!!!\n", buffer[10];
    fp = open("FIF02", 1);

    if (fp == -1)
    {
        printf("ERROR AL ABRIR EL FICHERO...");
        exit(1);
    }

    printf("Mandando información al FIFO...\n");
    write(fp, buffer, strlen(buffer));
    close(fp);
    return 0;

}