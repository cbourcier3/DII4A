#include "test.h"
#include <iostream>
#include <algorithm>
using namespace std;
test::test(){
    _tableau["Tours"] = 134803;
    _tableau["Rennes"] = 211373;
    _tableau["Nantes"] = 292718;
    _tableau["Caen"] = 107229;
}


void test::villeSuperieur(int nombre)
{
    for ( auto elem :_tableau)
        if (elem.second > nombre)
            std::cout << elem.first << " " << elem.second << endl;
}
