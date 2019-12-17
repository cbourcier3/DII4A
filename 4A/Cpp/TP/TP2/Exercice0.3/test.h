#ifndef test_h
#define test_h
#include <vector>
#include <string>
#include <map>
class test {
    public:
        test();
        void villeSuperieur(int nombre);
    private:
        std::map<std::string,int> _tableau;
};
#endif 