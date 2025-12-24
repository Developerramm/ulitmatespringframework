#include <iostream>
using namespace std;

int main()
{
    // declare a integer type variable
    int score;
    cout << "Enter score : ";
    // take input into score variable
    cin >> score;

    // if condition
    if (score < 300)
    {
        cout << "India wins " << endl;
    }
    else
    {
        cout << "Pakistan wins " << endl;
    }

    int age;
    cout << "Enter the age ";
    cin >> age;

    if (age >= 18)
    {
        cout << "I can vote " << endl;
    }
    else
    {
        cout << "I cannot vote " << endl;
    }


    

    return 0;
}