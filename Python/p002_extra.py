"""If we list all the natural numbers below 10 that are
multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000."""


# Let's first create a Python program to print
# the Fibonacci series up to a given integer n

def fibonacci_series(n):
    x = 1
    y = 2
    while x <= n:
        print(x, end="--")
        x, y = y, x + y


# Now let's create a function to get the sum of all the Fibonacci series numbers up to n
def getFibonacciSum(n):
    sum_fib = 0
    x = 1
    y = 2

    while x <= n:
        sum_fib += x
        x, y = y, x + y
    print("\nThe sum is " + str(sum_fib))


if __name__ == "__main__":
    n = int(input("Enter a number: "))
    fibonacci_series(n)
    getFibonacciSum(n)
