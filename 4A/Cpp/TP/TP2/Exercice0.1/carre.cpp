#include "carre.h"
using namespace std;

carre::carre(double c)
{
    setCote(c); 
}
void carre::setCote(double c)
{
    _cote = c;
}

double carre::aire()
{
    return cote() * cote();
}
double carre::cote()
{
    return _cote;
}
double carre::perimetre()
{
    return (cote()*4);
}
