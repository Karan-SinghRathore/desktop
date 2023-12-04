import pygame
import random


pygame.init()

# Set up the game window
screen_width = 800
screen_height = 400
window = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("Pong")

# Colors
background_color = (0, 0, 0)
paddle_color = (255, 255, 255)
ball_color = (255, 255, 255)
text_color = (255, 255, 255)

# Fonts
font = pygame.font.Font(None, 36)

#bat variables
paddle_width = 10
paddle_height = 80
player_paddle_pos = pygame.Rect(50, screen_height // 2 - paddle_height // 2, paddle_width, paddle_height)
opponent_paddle_pos = pygame.Rect(screen_width - 50 - paddle_width, screen_height // 2 - paddle_height // 2, paddle_width, paddle_height)
paddle_speed = 5

# Ball variables
ball_radius = 10
ball_pos = pygame.Rect(screen_width // 2 - ball_radius // 2, screen_height // 2 - ball_radius // 2, ball_radius, ball_radius)
ball_speed_x = random.choice([-2, 2])
ball_speed_y = random.choice([-2, 2])

# Game variables
player_score = 0
opponent_score = 0

# Game loop
running = True
clock = pygame.time.Clock()

while running:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Move player bat
    keys = pygame.key.get_pressed()
    if keys[pygame.K_UP] and player_paddle_pos.top > 0:
        player_paddle_pos.y -= paddle_speed
    if keys[pygame.K_DOWN] and player_paddle_pos.bottom < screen_height:
        player_paddle_pos.y += paddle_speed

    # Move opponent bat
    if opponent_paddle_pos.centery < ball_pos.y and opponent_paddle_pos.bottom < screen_height:
        opponent_paddle_pos.y += paddle_speed
    if opponent_paddle_pos.centery > ball_pos.y and opponent_paddle_pos.top > 0:
        opponent_paddle_pos.y -= paddle_speed
    ball_pos.x += ball_speed_x
    ball_pos.y += ball_speed_y
    if ball_pos.left <= 0 or ball_pos.right >= screen_width:
        ball_speed_x *= -1
    if ball_pos.top <= 0 or ball_pos.bottom >= screen_height:
        ball_speed_y *= -1 
    if ball_pos.colliderect(player_paddle_pos) or ball_pos.colliderect(opponent_paddle_pos):
        ball_speed_x *= -1
    if ball_pos.left <= 0:
        opponent_score += 1
        ball_pos.x = screen_width // 2 - ball_radius // 2
        ball_pos.y = screen_height // 2 - ball_radius // 2
        ball_speed_x *= random.choice([-1, 1])
        ball_speed_y *= random.choice([-1, 1])
    if ball_pos.right >= screen_width:
        player_score += 1
        ball_pos.x = screen_width // 2 - ball_radius // 2
        ball_pos.y = screen_height // 2 - ball_radius // 2
        ball_speed_x *= random.choice([-1, 1])
        ball_speed_y *= random.choice([-1, 1])

    #  the screen
    window.fill(background_color)
    pygame.draw.rect(window, paddle_color, player_paddle_pos)
    pygame.draw.rect(window, paddle_color, opponent_paddle_pos)
    pygame.draw.ellipse(window, ball_color, ball_pos)

    player_score_text = font.render(str(player_score), True, text_color)
    opponent_score_text = font.render(str(opponent_score), True, text_color)
    window.blit(player_score_text, (screen_width // 2 - 50, 10))
    window.blit(opponent_score_text, (screen_width // 2 + 30, 10))

    pygame.display.update()
    clock.tick(60)

# Quit the game
pygame.quit()
