# Pattern Generator

## 📌 Description
This Java program generates **character patterns** based on a given input string. The program calculates the number of possible patterns and prints them systematically by rotating the characters.

## 🛠 Features
- Accepts a user-inputted string.
- Calculates the number of possible patterns using the formula:  
  **Number of Patterns = (Length of String) × (Length of String - 1)**
- Displays unique character arrangements through character swapping and rotation.

## 📂 File Structure
- `Pattern.java` – Contains the implementation for the pattern generator.

## 🚀 Usage
1. **Compile the Java file:**
   ```sh
   javac Pattern.java
   ```
2. **Run the program:**
   ```sh
   java Pattern
   ```
3. **Enter a string when prompted:**
   ```
   String: ABC
   ```
4. **Example Output:**
   ```
   Number of Patterns : 6
   ABC
   ACB
   BAC
   BCA
   CAB
   CBA
   ```

## 📝 Explanation
1. The program reads an input string from the user.
2. It calculates the number of possible patterns using a simple formula.
3. The program swaps and rotates characters systematically to generate all possible patterns.
4. The results are printed in a structured format.

## 📜 License
This project is open-source and free to use.

