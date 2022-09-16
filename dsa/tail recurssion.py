def tailrecur(n,k):
    if n==0:
        return
    print(k)
    tailrecur(n-1,k+1)
o1=tailrecur(8,2)