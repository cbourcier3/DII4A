#ifndef carre_h
#define carre_h
#include "forme.h"
class carre : public forme {
    public:
        carre(double);
        double cote();
        void setCote(double c);
        virtual double aire();
        double perimetre();
    private:
        double _cote;
};
#endif 