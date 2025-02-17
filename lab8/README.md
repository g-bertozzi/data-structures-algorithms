Data Structures and Alogrithms- Lab 8: PairSum225 Algorithm

## Description
The goal of this lab is to design and implement an algorithm that solves the **PairSum225** problem. Given an array of non-negative integers, the algorithm determines if there are two distinct indices \( i \) and \( j \) such that the sum of the values at those indices equals 225.

### Problem Overview:
- **Input**: An array \( A \) of \( n \) non-negative integers.
- **Output**: A boolean value:
  - `true` if there exists two indices \( i \) and \( j \) such that \( A[i] + A[j] = 225 \).
  - `false` if no such pair exists.

### Approaches:
1. **Brute-force algorithm** (Time complexity: \( O(n^2) \)):
   - Check every pair \( A[i] + A[j] \) to see if it equals 225.
2. **Two-pointer algorithm** (Time complexity: \( O(n \log n) \)):
   - Sort the array and use two pointers, one starting from the left and the other from the right, to find a pair summing to 225.
3. **Optimal solution using a hash table** (Time complexity: \( O(n) \)):
   - Use a secondary array of length 226 to keep track of seen values and check for complementary values that sum to 225.

### Provided Test Files:
- Six test input files are provided:
  - Three with pairs summing to 225.
  - Three without any such pairs.
  
Use these files to verify the correctness of your implementation.

## Goal:
- Implement an algorithm that checks if any two numbers in the array sum to 225 using one of the three approaches above, with the optimal solution being \( O(n) \).
