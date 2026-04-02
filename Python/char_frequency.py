def char_frequency(s):
    freq = {}

    for ch in s:
        if ch in freq:
            freq[ch] += 1
        else:
            freq[ch] = 1

    return freq

# Example
print(char_frequency("hello"))
# Output: {'h':1, 'e':1, 'l':2, 'o':1}
