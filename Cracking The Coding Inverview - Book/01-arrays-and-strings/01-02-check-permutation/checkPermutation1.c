#include <stdio.h>
#include <stdbool.h>
#include <string.h>

char* sort(char* word)
{
    // Bubble sort the word (in place)
    int swaps;
    int loops = 0;
    do
    {
        swaps = 0;
        for (int i = 0, j = strlen(word) - 1 - loops; i < j; i++)
        {
            if (word[i] > word[i+1])
            {
                char tmp = word[i];
                word[i] = word[i+1];
                word[i+1] = tmp;
                swaps++;
            }
        }
        loops++;
    } while (swaps > 0);
    return word;
}


int main(int argc, char* argv[])
{
    if (argc != 3)
    {
        printf("Usage: ./check_permutations str1 str2\n");
        return 1;
    }

    sort(argv[1]);
    sort(argv[2]);

    if (strcmp(argv[1], argv[2]) == 0)
    {
        printf("true");
        return 0;
    }
    printf("false");
    return 0;
}