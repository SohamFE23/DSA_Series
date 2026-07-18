def reverse_array(arr):
    left = 0
    right = len(arr) - 1
    
    while left < right:
        # Swap elements
        arr[left], arr[right] = arr[right], arr[left]
        left += 1
        right -= 1
    return arr

# Example execution
numbers = [10, 20, 30, 40, 50]
print("Reversed Array:", reverse_array(numbers))
# Output: [50, 40, 30, 20, 10]
