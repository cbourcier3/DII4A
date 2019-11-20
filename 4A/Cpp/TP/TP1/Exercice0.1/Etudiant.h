#ifndef __etudiant
#define __etudiant
#include <string>
class etudiant
{
    private:
        std::string nom;
        std::string prenom;
        std::string dateNaissance;
    public:
        void setNom(std::string n);
        void setPrenom(std::string p);
        void setDateNaissance(std::string d);
        std::string getNom();
        std::string getPrenom();
        std::string getDateNaissance();
        int calculerAge();
        
};

#endif