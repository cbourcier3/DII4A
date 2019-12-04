#include "String.h"
#include <iostream>
using namespace std;

int main()
{
    
    String *test2 = new String("toto");
    String *test = new String("chaine");
    cout << test->getChaine() << endl;
    cout << test->empty() << endl;
    cout << test->compare(*test2) << endl;
    cout << test->compare(*test) << endl;
    test->setChaine("toto");
    cout << test->getChaine() << endl;
    cout << test->compare(*test2) << endl;
    //cout << true << ";" << false <<endl;
}