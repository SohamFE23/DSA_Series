#include <iostream>
using namespace std;

// Function returns the index if element is found, otherwise -1
int linearSearch(int arr[], int size, int target) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == target) {
            return i; 
        }
    }
    return -1; 
}

int main() {
    int arr[] = {4, 2, 8, 5, 1};
    int size = sizeof(arr) / sizeof(arr[0]); // Calculates array size
    int target = 5;
    
    int result = linearSearch(arr, size, target);
    
    if (result != -1) {
        cout << "Element found at index: " << result << endl;
    } else {
        cout << "Element not found." << endl;
    }
    return 0;
}
