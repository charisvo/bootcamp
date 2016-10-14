import math

a=float(input("please insert side a: "))
b=float(input("please insert side b: "))
c=float(input("please insert side c: "))
r=(a+b+c)*(-a+b+c)*(a+b-c)*(a-b+c)
area=1/4*math.sqrt(r)
print("the area of the triangle is:",area)
