#include <iostream>
#include <queue> // Required library

int main() {
    std::queue<string> q;

    // Add elements to the queue
    q.push("Alice");
    q.push("Bob");

    // Access the front element
    std::cout << "Front of queue: " << q.front() << std::endl;

    // Remove front element
    q.pop();

    std::cout << "Next in line: " << q.front() << std::endl;
    return 0;
}
