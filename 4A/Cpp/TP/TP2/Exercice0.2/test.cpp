#include "test.h"
#include <iostream>
#include <algorithm>
using namespace std;
test::test(){
    for(int i=0; i< 100; i++)
        _tableau.push_back(i);
}

void test::afficher(){
    for(int i =0; i<100; i++)
        std::cout << _tableau[i] << " ";
    std::cout << endl;
};

void test::melanger()
{
    for(int i=0; i<100; i++)
        random_shuffle(_tableau.begin(), _tableau.end());
}

int test::exist(int v)
{
    int retour = 0;
    std::vector<int>::iterator it; 
    it = find(_tableau.begin(),_tableau.end(), v);
    if (it != _tableau.end())
        retour = it - _tableau.begin();
    else retour = -1;
    return retour;
}