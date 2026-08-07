#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int maxSumSubarray(vector<int>& A) {
    int local_max = 0;
    int global_max = -1e9;
    for (int i = 0; i < A.size(); i++) {
        local_max = max(A[i], A[i] + local_max);
        if (local_max > global_max) {
            global_max = local_max;
        }
    }
    return global_max;
}

int main() {
    vector<int> nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    cout << "Max Sum: " << maxSumSubarray(nums) << "\n";
    return 0;
}
