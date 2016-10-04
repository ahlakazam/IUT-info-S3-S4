#include <iostream>
#include <time.h>

using namespace std;

int main()
{
    cout << "Hello world!" << endl;
    srand (time(NULL));
    int i=0;
    int tab[500];
    for (i=0;i<500;i++)
    {
        tab[i] = rand() %6+1;
    }
    return 0;
}
