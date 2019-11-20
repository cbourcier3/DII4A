#include <string>
#include "Etudiant.h"
using namespace std;
void etudiant::setNom(string n)
{
    nom = n;
}

void etudiant::setDateNaissance(string d)
{
    dateNaissance =d;
}

void etudiant::setPrenom(string p)
{
    prenom = p;
}

string etudiant::getNom()
{
    return nom;
}
string etudiant::getPrenom()
{
    return prenom;
}
string etudiant::getDateNaissance()
{
    return dateNaissance;
}