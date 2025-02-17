Data Structures and Algorithms - Lab 7: Counting Inversions

## Description

In this lab, we focus on implementing an algorithm to count **inversions** in an array. An inversion is defined as a pair of elements \( s_i \) and \( s_j \) such that \( i < j \) and \( s_i > s_j \). The lab provides two potential algorithms for counting inversions, with this implementation focusing on the **\( O(n + k) \)** algorithm, where \( k \) is the number of inversions and \( n \) is the size of the array.

### Problem Overview:
- **Input**: An array of integers \( A \) of size \( n \), where elements are in the range \( 1 \) to \( n \).
- **Output**: The total count of inversions in the array.

### Task:
- Implement the `CountInversion` function that counts the inversions in \( O(n + k) \) time, where \( k \) is the number of inversions.
- This approach is efficient when the number of inversions \( k \) is small.

## Files
- `CountInversion.java`: Contains the function to count inversions.
  
## Goal:
Implement an algorithm that counts inversions with the following runtime:
- **\( O(n + k) \)** time complexity.
