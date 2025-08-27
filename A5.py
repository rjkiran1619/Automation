#Quadrative equation
import cmath

#import cmathmath

a = int(input("enter the value of a:"))
b = int(input("enter the value of b:"))
c = int(input("enter the value of c:"))
d = (b**b)-(4*a*c)

e = (-b - cmath.sqrt(d))/(2*a)
f = (-b + cmath.sqrt(d))/(2*a)
print("solution is {0} and {1}:".format(e,f))
