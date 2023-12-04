import turtle

flower = turtle.Turtle()
flower.speed(0)
flower.width(2)

colors = ["red", "orange", "yellow", "green", "blue", "purple"]
radius = 100

for _ in range(36):
    flower.color(colors[_ % 6])
    flower.circle(radius)
    flower.right(90)
    flower.circle(radius)
    flower.right(90)
    radius += 10

turtle.done()
