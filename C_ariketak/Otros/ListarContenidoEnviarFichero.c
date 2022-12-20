#include <stdio.h>
#include <stdlib.h>
void main()
{
printf("Ejemplo de uso de system():");
printf("\n\tListado del directorio actual y envió a un fichero:");
printf("%d",system("Is > ficsalida"));
printf("\n\tAbrimos con el gedit el fichero...");
printf("%d",system("gedit 'C ariketak'"));
printf("\n\tEste comando es erróneo: %d",system("ged"));
printf("\nFin de programa ....\n") ;
}