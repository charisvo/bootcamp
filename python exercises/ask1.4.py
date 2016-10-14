import math

a=float(input("please insert a: "))
b=float(input("please insert b: "))
c=float(input("please insert c: "))
if (b**2-4*a*c)<0:
    print("no real-valued solutions exist")
else:
    x=(-b+math.sqrt(b**2-4*a*c))/2*a
    y=(-b-math.sqrt(b**2-4*a*c))/2*a
    print("the solutions are :",x,",",y)
