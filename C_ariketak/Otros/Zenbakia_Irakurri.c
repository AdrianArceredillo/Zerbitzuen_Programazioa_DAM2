#include <stdio.h>
#include <math.h>

int main(int argc, char * argv[]) {

    int zenb;
    printf("Sartu zenbaki bat: ");
    scanf("%i", &zenb);

    int *punteroa;

    printf("Zuk sarturiko zenbakia hurrengoa da: %i\n", zenb);
    printf("Zuk sarturiko zenbakia hemen dago gordeta: %p\n", &zenb);
    punteroa = &zenb;
    *punteroa = 7;
    printf("Zuk sarturiko zenbakia hurrengoa da: %i\n", zenb);

    return 0;
}