#ifndef test_h
#define test_h
#include <vector>
class test {
    public:
        test();
        void melanger();
        void afficher();
        int exist(int v);
    private:
        std::vector<int> _tableau;
};
#endif 