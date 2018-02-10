# Gridland Metro

The city of Gridland is represented as an `n x m` matrix where the rows are numbered from `1` to `n` and the columns are numbered from `1` to `m`.

Gridland has a network of train tracks that always run in straight horizontal lines along a row. In other words, the start and end points of a train track are `(r, c1)` and `(r, c2)`, where `r` represents the row number, `c1` represents the starting column, and `c2` represents the ending column of the train track.

The mayor of Gridland is surveying the city to determine the number of locations where lampposts can be placed. A lamppost can be placed in any cell that is not occupied by a train track.

Given a map of Gridland and its `k` train tracks, find and print the number of cells where the mayor can place lampposts.

>A train track may (or may not) overlap other train tracks within the same row.

## Input Format

The first line contains three space-separated integers describing the respective values of `n` (the number of rows), `m` (the number of columns), and `k` (the number of train tracks).
Each line `i` of the `k` subsequent lines contains three space-separated integers describing the respective values of `r`, `c1`, and `c2` that define a train track.

## Constrains

* 1 <= n,m <= Pow(10, 9)
* 0 <= k <= 1000
* 1 <= r <= n
* 1 <= c1 <= c2 <= m

## Output Format

Print a single integer denoting the number of cells where the mayor can install lampposts.

## Sample Input

```
4 4 3
2 2 3
3 1 4
4 4 4
```

## Sample Output

```
9
```