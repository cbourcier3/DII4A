#ifndef __string__
#define __string__
#include <cstddef>


class String {
    private:
        char* _chaine;
        size_t _taille;
    public:
        String(void);
        String(char *chaine);
        String(String &chaine);
        String(size_t n, char c);

        size_t size();
        void clear();
        bool empty();
        char *c_str();
        char at(size_t size);
        bool compare(String s);

        char* getChaine();
        void setChaine(char* chaine);
};
#endif