#include <iostream>
#include <string>
#include "test.h"
using namespace std;


int main()
{
    test *t = new test();
    t->afficher();
    t->melanger();
    t->afficher();
    cout << "45 existe à : " << t->exist(45) << endl;
    cout << "4555 existe à : "<< t->exist(4555) << endl;

    delete t;

    return 0;
}