#include <string.h>

int main()
{
    char str[20];
    strcpy(str, "123456789");
    int val = atoi(str);
    printf("%i zenbakia da", val);

    exit(0);
}
