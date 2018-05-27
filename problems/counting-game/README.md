# Counting Game

Louise and Richard have developed a numbers game. They pick a number and check to see if it is a power of `2`. If it is, they divide it by `2`. If not, they reduce it by the next lower number which is a power of `2`. Whoever reduces the number to `1` wins the game. Louise always starts.

Given an initial value, determine who wins the game.

As an example, let the initial value `n = 132`. It's Louise's turn so she first determines that `132` is not a power of `2`. The next lower power of `2` is `128`, so she subtracts that from `132` and passes `4` to Richard. `4` is a power of `2`, so Richard divides it by `2` and passes `2` to Louise. Likewise, `2` is a power of `2` so she divides it by `2` and reaches `1`. She wins the game.

> If they set counter to `1`, Richard wins. Louise' cannot make a move so she loses.

## Input Format

The first line contains an integer `t`, the number of testcases. 
Each of the next `t` lines contains an integer `n`, the initial value for the game.

### Constraints

* 1 <= t <= 10
* 1 <= n <= Pow(2, 64) - 1

## Output Format

For each test case, print the winner's name on a new line in the form `Louise` or `Richard`.

### Sample Input

```
1
6
```

### Sample Output

```
Richard
```