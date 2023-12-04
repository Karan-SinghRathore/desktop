import pygame
import random

# Initialize Pygame
pygame.init()

# Set up the game window
screen_width = 800
screen_height = 600
window = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("Bubble Pop")

# Colors
background_color = (0, 0, 0)
bubble_color = (0, 255, 255)
pop_color = (255, 0, 0)
text_color = (255, 255, 255)

# Fonts
font = pygame.font.Font(None, 36)

# Bubble variables
bubble_radius = 30
bubble_speed = 2

# Game variables
score = 0
pop_sound = pygame.mixer.Sound("plop.ogg")

# Load background image
background_image = pygame.image.load("back.jpeg")
background_image = pygame.transform.scale(background_image, (screen_width, screen_height))

# Bubble class
class Bubble(pygame.sprite.Sprite):
    def __init__(self):
        super().__init__()
        self.image = pygame.Surface((bubble_radius * 2, bubble_radius * 2))
        self.image.fill((0, 0, 0))
        pygame.draw.circle(self.image, bubble_color, (bubble_radius, bubble_radius), bubble_radius)
        self.rect = self.image.get_rect()
        self.rect.x = random.randint(0, screen_width - bubble_radius * 2)
        self.rect.y = random.randint(0, screen_height - bubble_radius * 2)
        
    def update(self):
        self.rect.y += bubble_speed
        if self.rect.y > screen_height:
            self.rect.y = -bubble_radius * 2
            self.rect.x = random.randint(0, screen_width - bubble_radius * 2)

# Create bubble group
bubble_group = pygame.sprite.Group()

# Add bubbles to the group
for _ in range(10):
    bubble = Bubble()
    bubble_group.add(bubble)

# Game loop
running = True
clock = pygame.time.Clock()

while running:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        if event.type == pygame.MOUSEBUTTONDOWN:
            pos = pygame.mouse.get_pos()
            clicked_bubbles = [bubble for bubble in bubble_group if bubble.rect.collidepoint(pos)]
            for bubble in clicked_bubbles:
                bubble_group.remove(bubble)
                score += 1
                pop_sound.play()

    # Update bubbles
    bubble_group.update()

    # Update the screen
    window.blit(background_image, (0, 0))

    # Draw bubbles
    bubble_group.draw(window)

    # Display the score
    score_text = font.render("Score: " + str(score), True, text_color)
    window.blit(score_text, (10, 10))

    pygame.display.update()
    clock.tick(60)

# Quit the game
pygame.quit()
