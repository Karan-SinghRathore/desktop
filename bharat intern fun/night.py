import turtle
import random

screen = turtle.Screen()
screen.bgcolor("black")

def draw_star():
    x = random.randint(-300, 300)
    y = random.randint(-200, 200)
    size = random.randint(5, 30)

    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    turtle.color("white")
    turtle.begin_fill()

    for _ in range(5):
        turtle.forward(size)
        turtle.right(144)
    
    turtle.end_fill()

turtle.speed(0)

for _ in range(50):
    draw_star()

turtle.done()
