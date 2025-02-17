Data Structures and Algorithms- Lab 9: Heapsort Algorithm

## Overview
This repository contains the implementation of the **Heapsort** algorithm for sorting an array in ascending order. Heapsort is a comparison-based sorting algorithm that uses a binary heap data structure to organize and sort the elements efficiently.

## Problem
The task is to implement the Heapsort algorithm, which involves:
1. **Building a max-heap** from the input array.
2. **Swapping** the root (maximum value) with the last element of the heap.
3. **Restoring the heap property** by applying the `MaxHeapify` function after each swap.
4. **Repeating the process** until the array is fully sorted.

## Approach
The algorithm is divided into two main parts:
1. **Heapsort**: Builds the heap and sorts the array in-place.
2. **MaxHeapify**: Ensures that a subtree rooted at a given index satisfies the max-heap property.

## Usage
Clone this repository to implement and run the Heapsort algorithm on an array of integers. The algorithm efficiently sorts the array in-place by maintaining the heap structure.
