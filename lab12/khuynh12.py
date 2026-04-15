#Kenny Huynh
#csc-321
#lab 12

import math

def arearect(base,height):
    return (base*height)

def areacirc(radius):
    return (math.pi*radius*radius)

base, height = map(int,input("Please Enter the base and height of a rectangle: ").split())
#print("The area of the rectangle is:",arearect(base,height))
rectanglearea =  arearect(base,height)
print("The area of the rectangle is:", rectanglearea)

radius = int(input("Please enter the radius of the circle: "))
#print("The area of the circle is:",areacirc(radius))
circlearea = areacirc(radius)
print("The area of the circle is:",circlearea)



