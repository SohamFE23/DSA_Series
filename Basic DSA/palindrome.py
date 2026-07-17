def is_palindrome(text):
    # Clean string: lowercase and remove non-alphanumeric characters
    cleaned = "".join(char.lower() for char in text if char.isalnum())
    
    left, right = 0, len(cleaned) - 1
    while left < right:
        if cleaned[left] != cleaned[right]:
            return False  # Characters mismatch
        left += 1
        right -= 1
    return True

# Example usage
print(is_palindrome("A man, a plan, a canal: Panama"))  # Output: True
