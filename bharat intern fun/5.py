import turtle

spiral = turtle.Turtle()

spiral.speed(0)
turtle.bgcolor("black")
colors = ["red", "orange", "yellow", "green", "blue", "purple"]

for i in range(200):
    spiral.color(colors[i % 6])
    spiral.forward(i)
    spiral.right(91)

turtle.done()

