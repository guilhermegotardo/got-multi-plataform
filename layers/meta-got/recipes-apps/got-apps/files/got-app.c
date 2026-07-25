#include <stdio.h>
#include <unistd.h>
#include <time.h>

int main(void)
{
    printf("GOT App hello world started successfuly.\n");
    printf("GOT APP PID: %ld\n", (long)getpid());

    while (1) {
        time_t now = time(NULL);

        printf("GOT App: time is: %s", ctime(&now));
        fflush(stdout);

        sleep(10);
    }

    return 0;
}