#include <iostream>
#include <string>
#include "carre.h"

void afficherAire( forme &f ){
    std::cout << f.aire()<< std::endl;
    std::cout << f.perimetre()<< std::endl;
}

using namespace std;

int main()
{
    carre c(10);
    afficherAire(c);
    c.setCote(100);
    afficherAire(c);
    return 0;
}