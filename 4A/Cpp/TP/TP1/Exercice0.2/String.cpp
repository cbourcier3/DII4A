#include "String.h"
#include <cstring>
String::String()
{
    _taille = 0;
    _chaine = new char[_taille+1];
    _chaine[0] = '\0';
}

String::String(char *chaine)
{
    _taille = strlen(chaine);
    _chaine = new char[_taille + 1];
    for(int i=0; i<_taille; i++)
        _chaine[i]=chaine[i];
    _chaine[_taille+1] = '\0';
}

String::String(String &chaine)
{
    

}

String::String(size_t n, char c)
{
    _taille = n;
    _chaine = new char[_taille+1];
    for(int i = 0; i < _taille; i++)
        _chaine[i]=c;
    _chaine[_taille+1] = '\0';
}

size_t String::size(){
    return _taille;
}

void String::clear(){
    delete _chaine;
    _taille = 0;
}

bool String::empty(){
    bool res = false;
    if (_taille == 0) res = true;
    return res;
}

char* String::c_str(){

}

char String::at(size_t s){
    return _chaine[s];
}

bool String::compare(String s){
    bool retour = true;
    if(_taille == s.size())
    {
        for (int i = 0; i<_taille; i++)
        {
            if(_chaine[i]!=s.at(i))
                retour = false;
        }
    }
    else retour = false;
    return retour;
}


char* String::getChaine(){
    return _chaine;
}



void String::setChaine(char* chaine){
    _taille = strlen(chaine);
    _chaine = new char[_taille + 1];
    for(int i=0; i<_taille; i++)
        _chaine[i]=chaine[i];
    _chaine[_taille+1] = '\0';
}