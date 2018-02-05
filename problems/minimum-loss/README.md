# Minimum Loss

Lauren has a chart of distinct projected prices for a house over the next `n` years, where the price of the house in the `ith` year is `pi`. She wants to purchase and resell the house at a minimal loss according to the following rules:

* The house cannot be sold at a price greater than or equal to the price it was purchased at (i.e., it must be resold at a loss).
* The house cannot be resold within the same year it was purchased.

Find and print the minimum amount of money Lauren must lose if she buys the house and resells it within the next `n` years.

>Note: It's guaranteed that a valid answer exists.

## Input Format

The first line contains an integer `n`, denoting the number of years of house data.

The second line contains `n` space-separated long integers describing the respective values of `p1, p2, ..., pn`.

## Contrstraint

* 2 <= n <= 2 x Pow(10, 5)
* 1 < = pi <= Pow(10, 16)
* All the prices are distinct
* It is guaranteed that a valid answer exists

## Output Format

Print a single integer denoting the minimum amount of money Lauren must lose if she buys and resells the house within the next `n` years.

## Sample Input 0

```
3
5 10 3
```

## Sample Output 0

```
2
```

## Sample Input 1

```
5
20 7 8 2 5
```

## Sample Output 1

```
2
```