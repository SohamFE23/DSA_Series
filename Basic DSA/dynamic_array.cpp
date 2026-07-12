#include <iostream>
#include <vector> // Required library

int main() {
    // Initialize an empty vector of integers
    std::vector<int> numbers;

    // Insert elements at the end
    numbers.push_back(10);
    numbers.push_back(20);
    numbers.push_back(30);

    // Access elements using indices
    std::cout << "First element: " << numbers[0] << std::endl;

    // Traverse the vector using a modern loop
    std::cout << "All elements: ";
    for (int num : numbers) {
        std::cout << num << " ";
    }
    
    return 0;
}
