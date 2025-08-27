from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time

# Set up Chrome WebDriver (Update path if needed)
driver = webdriver.Chrome()

# Step 1: Launch Flipkart
driver.get("https://www.flipkart.com")
driver.maximize_window()

# Step 2: Wait for the page to load
time.sleep(3)

# Step 3: Validate the title
expected_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
actual_title = driver.title

assert expected_title in actual_title, f"Title mismatch: Expected '{expected_title}', got '{actual_title}'"

# Step 4: Close the browser
driver.quit()

print("✅ Flipkart launched and title verified successfully.")