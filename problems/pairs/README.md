# Pairs

## Function prototype:

```
int solveMeFirst(int x, int y);
```

where,

* `x` is the first integer input.
* `y` is the second integer input

## Return values

* sum of the above two integers

## Input Format

The first line contains `n` and `k`. 
The second line contains `n` numbers of the set. All the `n` numbers are unique.

## Constraint

* `2` <= `n` <= `Pow(10, 5)`
* `0` < `k` < `Pow(10, 9)`

Each integer will be greater than `0` and at least `k` smaller than `Pow(2, 31) - 1`.

## Output Format

An integer that tells the number of pairs of integers whose difference is `k`.

## Sample Input

```
5 2
1 5 3 4 2
```

## Sample Output

```
3
```
