#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool is_permutation(char* w1, char* w2)
{
    int letters[128] = { 0 };

    for (int i = 0; i < strlen(w1); i++)
    {
        letters[w1[i]]++;
    }

    for (int i = 0; i < strlen(w2); i++)
    {
        letters[w2[i]]--;
        if (letters[w2[i]] < 0)
        {
            return false;
        }
    }

    return true;
}

int main(void)
{
    if (is_permutation("renzo", "ozner") == true)
    {
        printf("true\n");
    }
    else
    {
        printf("false\n");
    }
}