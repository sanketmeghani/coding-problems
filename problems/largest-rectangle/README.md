# Largest Rectangle

Skyline Real Estate Developers is planning to demolish a number of old, unoccupied buildings and construct a shopping mall in their place. Your task is to find the largest solid area in which the mall can be constructed.

There are a number of buildings in a certain two-dimensional landscape. Each building has a height, given by `h[i]` where `1 <= i <= n`. If you join `k` adjacent buildings, they will form a solid rectangle of area `k * min(h[i], h[i+1], ..., h[i+k-1])`.

For example, given the heights array `h = [3, 2, 3]`. A rectangle of height `h = 2` and lenght `k  = 3` can be formed within the boundaries. The area formed is `h * k = 2 * 3 = 6`.

Write a programme to find the largest rectangle that can be formed within the bounds of consecutive buildings.

## Input Format

The first line contains `n`, the number of buildings. 
The second line contains `n` space-separated integers, each representing the height of a building.

## Output Format

Print a long integer representing the maximum area of rectangle formed.

## Sample Input

```
5
1 2 3 4 5
```

## Sample Output

```
9
```