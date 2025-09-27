#include <iostream>
using namespace std;

int main()
{

    int n;
    cout << "enter  the elemnts" << endl;
    cin >> n;

    int arr[n];
    cout << "enter array element" << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int largest = arr[0];
    int secondlargest = -1;
    for (int i = 0; i < n ; i++)
    {
        if (largest < arr[i])

        {
            secondlargest = largest;
            largest = arr[i];
        }
        else if (arr[i] > secondlargest && arr[i] != largest)
        {
            secondlargest = arr[i];
        }
    }

    cout << secondlargest << endl;
}