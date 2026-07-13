#include <iostream>
using namespace std;

int main() {
    // Declaring and initializing an array of 5 elements
    int arr[5] = {10, 20, 30, 40, 50};
    
    // Traversing and printing array elements
    cout << "Array elements: ";
    for (int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}
