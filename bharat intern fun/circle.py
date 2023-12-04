import turtle

# Create turtle object
spiral = turtle.Turtle()

# Set turtle properties
spiral.speed(0)
turtle.bgcolor("black")
colors = ["red", "orange", "yellow", "green", "blue", "purple"]

# Create a spiral pattern
for i in range(300):
    spiral.forward(i)
    spiral.right(91)
    spiral.color(colors[i%6])

# Hide the turtle
spiral.hideturtle()

# Exit on click
turtle.exitonclick()
1