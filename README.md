 Green Life Tracker 🌱

Green Life Tracker is a Java-based **console application** designed to encourage sustainable living by allowing users to log eco-friendly actions and measure their environmental impact through a structured scoring system.

This project demonstrates **clean object-oriented design**, **file persistence**, **input validation**, and a **modular CLI architecture**, making it suitable for academic use, self-learning, and portfolio presentation.

---

 ✨ Features

- Log eco-friendly actions (e.g., saving water, using public transport)
- Categorize actions into predefined sustainability domains
- Assign and calculate environmental impact scores
- Persist data locally using file handling
- View total environmental impact at any time
- Clean, readable, and professional console interface
- Modular code structure following OOP principles

---

🧠 How the Application Works

1. When the application starts, a menu-driven console interface is displayed.
2. The user can choose to:
   - Add a new eco-friendly action
   - View all logged actions
   - View the total environmental impact score
   - Exit the application
3. Each action includes:
   - Action name
   - Category (Water, Energy, Travel, Waste)
   - Impact score (1–10)
4. All actions are saved to a local file (`actions.txt`) automatically.
5. On restart, previously saved actions are loaded and displayed.

The application runs continuously until the user chooses to exit.

---
 🏗️ Project Structure
GreenLifeTracker/
├── src/
│ ├── Main.java # Application entry point
│ ├── ConsoleUI.java # Handles user interaction & menus
│ ├── EcoAction.java # Data model representing an eco action
│ └── ActionManager.java # Business logic & file persistence

---
🛠️ Technologies Used

- Java (Core Java)
- Object-Oriented Programming (OOP)
- File I/O (java.io)
- Collections Framework
- Command Line Interface (CLI)
- Git & GitHub for version control

---
 ▶️ How to Run the Project

### Prerequisites
- Java JDK 17 or higher installed
- Git (optional, for cloning)

### Steps

```bash
# Navigate to the source directory
cd src

# Compile all Java files
javac Main.java EcoAction.java ActionManager.java ConsoleUI.java

# Run the application
java Main





