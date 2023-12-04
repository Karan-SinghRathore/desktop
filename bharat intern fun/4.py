import turtle

spiro = turtle.Turtle()
spiro.speed(0)
spiro.width(2)

colors = ["red", "orange", "yellow", "green", "blue", "purple"]
radius = 100
angle = 0

for _ in range(36):
    spiro.color(colors[_ % 6])
    spiro.circle(radius)
    spiro.right(10)
    radius += 10

turtle.done()
