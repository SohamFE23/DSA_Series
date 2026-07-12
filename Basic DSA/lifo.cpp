#include <iostream>
#include <stack> // Required library

int main() {
    std::stack<int> s;

    // Push elements onto the stack
    s.push(100);
    s.push(200);

    // View top element (200)
    std::cout << "Top element: " << s.top() << std::endl;

    // Remove the top element
    s.pop();

    std::cout << "New top element: " << s.top() << std::endl;
    return 0;
}
