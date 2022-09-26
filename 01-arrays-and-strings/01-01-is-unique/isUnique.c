#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool is_unique(char* word)
{
    int length = strlen(word);

    // Represent ASCII characters
    bool char_set[128] = { false };

    for (int i = 0; i < length; i++)
    {
        int val = word[i];
        if (char_set[val] == true)
        {
            return false;
        }
        char_set[val] = true;
    }
    return true;
}

int main(void)
{
    char* words[] = {"Renzo", "Abigail", "Aitana", "Belon", "Giol"};

    for (int i = 0; i < sizeof(words)/4; i++)
    {
        if (is_unique(words[i]) == true)
        {
            printf("%s -> true\n", words[i]);
        }
        else
        {
            printf("%s -> false\n", words[i]);
        }
    }
}
