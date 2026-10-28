# Simple 2D Stack Visualizer Application

## Group Information
* **Group Name:** [Walang Ewanan]
* **Group Members:**
  * Belar, Aze Jiazeler Jobe C.
  * Noeljr Depita
  * Marialyn Bahian Leong

---

## Description of the Program
This application is a 2D graphical visualization tool designed to demonstrate the mechanics of the **Stack Abstract Data Type (ADT)**. Built using Java swing, the program provides an interactive dashboard where users can perform core stack mutations and view structural state transitions in real time. 

---

## Features
* **LIFO Operation Tracking:** Visually animates standard stack primitives including `Push`, `Pop`, and `Peek`.
* **Bounded Index Protection:** Enforces a rigid structure array capacity limit of exactly 10 data nodes.
* **Dynamic Exception Toasting:** Displays clear contextual warnings for structural validation threshold violations (`STACK OVERFLOW` and `STACK UNDERFLOW`).
* **Specialized System Controls:** Includes utility options to securely examine vacancy statuses (`Check Stack`), clear the memory workspace (`Clear`), or instantly generate bounded test cases (`Random`).
* **Vertical Element Level Shifting:** Automatically maps array elements top-to-bottom on a 2D layout grid, identifying the active uppermost element with a structural pointer arrow (`<-- TOP`).

---

## Requirements
* **Java Development Kit (JDK):** Version 8 or higher.
* **Operating System:** Windows, macOS, or Linux.
* **IDE (Optional):** NetBeans, Eclipse, IntelliJ IDEA, or VS Code.



## How to Run the Program
1. **Compile the Code:**
   Open your system command prompt or terminal inside the project source folder and run:
   ```
   javac StackVisualizerGUI.java ArrayBoundedStack.java
   ```
2. **Execute the Application:**
   ```
   java StackVisualizerGUI
   ```
   
---


## Project Structure
src/

├── ArrayBoundedStack.java   # Core Data Structure Logic Component

└── StackVisualizerGUI.java  # Swing/AWT Graphical Interface Window Component
```

---


## Stack Implementation
The application implements an **Array-Based Bounded Stack** utilizing primitive data logic:
* **Storage Allocation:** Handled via a private fixed array sequence `int[] elements` mapped to a max parameter boundary constraint of `10`.
* **Tracking Pointer:** Driven by a scalar tracker variable `int top` initialized at `-1` to explicitly register structural vacancies.
* **Encapsulation Separation:** The User Interface elements cannot directly alter array memory contents. All state adaptations are brokered via public structural class methods (`push()`, `pop()`, `peek()`, `isEmpty()`, `isFull()`).

---

## Screenshots

---

AI DISCLOSURE STATEMENT:
* AI Tool and Version: Google Gemini (Version 1.5 Pro)
* Primary Tasks Performed: Structured foundational Java boilerplate components, assisted in debugging the user input validation logic, and formatted the technical report documentation.
* Primary Prompts Used: 
  - "Can you make a boilerplate of a java swing program that has peek, push, pop, clear"
* Extent of Utilization: Utilized for initial skeleton code architecture drafting, resolving the try-catch validation debugging strategy, and drafting the system architecture narrative.
* Human Verification Statement: I reviewed every line of the generated boilerplate structure, manually compiled and executed the logic routines inside the IDE, and edited the documentation text to completely match the specific variables used in our project build.
* Why and How Was AI Used: AI was used to provide a boilerplate and structure and ensure clear, comprehensive technical descriptions that align precisely with the instructor's requirements.
* Estimated Work Percentage Assisted: Approximately 20% of the total project lifecycle workload (restricted strictly to design framing, debugging support, and documentation formatting).
* Changes Made to AI Output: Streamlined the generated boilerplate code by removing redundant lines, restructuring the loop parameters to make the visual logic simpler to read.
* Lessons Learned from Using the Tool: Learned the critical importance of decoupling presentation code modules from underlying structural elements using class interface boundaries, and learned how to intercept non-integer parsing errors using standard java exception handling patterns.

---

## Contributors
@marialynleong130-debug
marialynleong130-debug
Collaborator


@ZaZa-cmdforu
Sak
ZaZa-cmdforu • Collaborator
