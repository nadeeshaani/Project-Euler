# Program to check whether a number is prime or not


def is_prime(n):
    j = 2
    while j < n:
        if n % j == 0:
            return False
        j += j

    return True
  
  # a program to find all factors of a number

def calculate_factors(n):
    i = 1
    while i <= n:
        if n % i == 0:
            print(i)
            n = n /i

        i += 1


def is_prime(n):
    j = 2
    while j < n:
        if n % j == 0:
            return False
        j += j

    return True


# Now we are going to print only the prime factors of a number

def calc_Primefactors(n):
    i = 1
    while i <= n:
        if n % i == 0:
            if is_prime(n):
                print(i)

        i += 1


calc_Primefactors(13195)
