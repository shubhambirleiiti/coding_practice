fact=1
def factorial(n):
    if n==0:
        return 0
    else:
        fact=fact*n
        factorial(n-1)
    return fact
o1=factorial(9)
print(o1.factorial())