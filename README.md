# Kotlin `removeIf` Gotcha: Unexpected Element Skipping

This repository demonstrates a potential issue when using Kotlin's `removeIf` function with mutable lists. The issue arises when removing elements based on a condition while iterating through the list.  The standard iteration approach can skip some elements due to index shifting caused by removal operations.

The `bug.kt` file contains the problematic code, and `bugSolution.kt` demonstrates a solution to prevent this behavior.

## Bug Description

The original code intends to remove even numbers from a list using `removeIf`. However, because `removeIf` modifies the list in place, the index-based iteration can result in unexpected elements being skipped.

## Solution

The solution provided in `bugSolution.kt` addresses this by creating a copy of the list before the removal operation and iterating over the copy. This approach guarantees that all elements are checked for removal without unintended index shifts.