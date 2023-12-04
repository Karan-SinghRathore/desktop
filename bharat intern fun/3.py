import turtle

zigzag = turtle.Turtle()
zigzag.speed(0)
turtle.bgcolor("black")
colors = ["red", "orange", "yellow", "green", "blue", "purple"]

for i in range(100):
    zigzag.color(colors[i % 6])
    zigzag.forward(100)
    zigzag.right(120)
    zigzag.forward(100)
    zigzag.right(120)
    zigzag.forward(100)
    zigzag.right(120)
    zigzag.right(10)

turtle.done()
