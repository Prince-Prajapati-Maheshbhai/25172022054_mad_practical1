# 🧠 MAD Practical 1 — Kotlin Fundamentals

![Language](https://img.shields.io/badge/Language-Kotlin-7F52FF?logo=kotlin&logoColor=white)
![Type](https://img.shields.io/badge/Type-Console%20Programs-informational)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-000000?logo=intellijidea&logoColor=white)
![Programs](https://img.shields.io/badge/Programs-11-success)

**Subject:** Mobile Application Development (MAD)

**Practical No.:** 1

**Author:** Prajapati Prince Maheshbhai

**Enrollment No.:** 25172022054

---

## 📖 Overview

This repository contains **11 Kotlin console programs** that cover the basics needed before starting Android development: variables and data types, user input, conditions, functions, loops, arrays, matrix operations and object-oriented programming (classes, constructors and inheritance).

## 🎯 Aim

To learn and practise the core concepts of the Kotlin programming language through small, focused programs.

## 📋 Programs List

| No. | Program | Concepts |
|:---:|---|---|
| 1 | Variable initialization with all data types | `var`, `val`, type declaration, string templates |
| 2 | Matrix addition, subtraction & multiplication | Classes, 2D arrays, operator overloading, nested loops |
| 3 | Reading input from the user | `readln()`, type conversion, null-assertion `!!` |
| 4 | Even or odd number | `if` as an expression |
| 5 | Month name from month number | `when` expression |
| 6 | Calculator using functions | Functions, parameters, return values |
| 7 | Factorial of a number | `for` loop, ranges, `Long` |
| 8 | Different ways to create arrays | `arrayOf`, `Array<>`, `IntArray`, nested arrays |
| 9 | Largest element in a list | `ArrayList`, loops, comparison |
| 10 | Car class with secondary constructor | Primary & secondary constructors, `open class` |
| 11 | Suzuki class inheriting from Car | Inheritance, calling super constructor |

---

## 🔍 Program Details

### Program 1 — Variable Initialization
Declares variables of every basic type and prints them using both string templates (`$i`, `${j}`) and concatenation.

- **Types used:** `Int`, `String`, `Char`, `Float`, `Boolean`, `Double`, `Long`, `Short`, `Byte`
- Uses `var` for mutable and `val` for read-only variables (`val z = 20000` shows type inference).

**Output**
```
i=200
j=100
v=Prince
k=P
f=15.4
b=false
d=1.2
l=12345678
s=12
g=12
20000
```

### Program 2 — Matrix Operations
A `Matrix` class that stores an `Array<IntArray>` with its row and column count, and overloads the `+`, `-` and `*` operators.

- **Addition / Subtraction:** both matrices must have the same size (3 × 2 in the demo).
- **Multiplication:** columns of the first matrix must equal rows of the second (2 × 3 times 3 × 2 gives 2 × 2).
- `toString()` is overridden to print a matrix neatly.

**Sample result**
```
Addition (3 x 2):        Subtraction (3 x 2):     Multiplication (2 x 2):
8   6                    4   0                    58   64
0   0                    18  0                    139  154
5   8                    5   0
```

### Program 3 — User Input & Type Conversion
Converts a `String?` to `Int` using `!!.toInt()`, then reads the following details from the keyboard and prints each back:

Enrollment No. (`Long`) · Name · Branch · Class · Batch · College Name · University Name · Age (`Int`)

### Program 4 — Even or Odd
Reads a number and uses an `if-else` **expression** with the modulus operator (`%`) to print `Even` or `Odd`.

### Program 5 — Month Name
Reads a month number (1–12) and uses a `when` expression to print the month name. Any other value prints `Please enter proper number`.

### Program 6 — Calculator Using Functions
Reads two integers and calls four separate functions: `add()`, `sub()`, `mul()` and `div()`, printing each result.

> ⚠️ Division is integer division, and entering `0` as the second number will throw an `ArithmeticException`.

### Program 7 — Factorial
Reads a number and calculates its factorial with a `for` loop over `1..number`. A `Long` is used to hold larger results, and negative numbers show an error message.

**Example:** input `5` → `Factorial of 5 is 120`

### Program 8 — Arrays
Shows the different ways of creating arrays in Kotlin:

| Method | Example |
|---|---|
| `arrayOf()` | `arrayOf('A','B','C','D')` |
| `Array<Int>(size){ init }` | `Array<Int>(5){0}` |
| Array with index-based lambda | `Array<Int>(5){ i -> i*i }` → `0, 1, 4, 9, 16` |
| 2D array | `Array(2) { Array<Int>(2) { 0 } }` |
| 3D array | `Array(3) { Array(3) { Array<Int>(3) { 0 } } }` |
| `IntArray(size)` | `IntArray(5){0}` |
| `intArrayOf()` | `intArrayOf(5)` creates an array with one element, `5` |

Arrays are printed with `joinToString()` and `contentDeepToString()`.

### Program 9 — Largest Element
Reads 5 integers into an `ArrayList<Int>`, then finds the maximum by looping through the list and comparing each element.

### Program 10 — Car Class (Constructors)
An `open class Car` with a **primary constructor** (`model`) and a **secondary constructor** (`price`, `model`) that delegates to the primary one using `this(m)`.

**Output**
```
model:BMW M4 comp
Prise:12000.0
model:Suzuki
Prise:10000.0
```

### Program 11 — Suzuki Class (Inheritance)
`Suzuki` extends `Car` by passing its model name to the parent constructor (`Car(m)`). It demonstrates creating objects of both the parent and child class and reading their `model` and `price` properties.

---

## 📂 Project Structure

```
25172022054_mad_practical1/
├── .idea/
│   ├── P1_1.kt
│   ├── P1_10.kt
│   ├── P1_11.kt
│   ├── P1_2.kt
│   ├── P1_3.kt
│   ├── P1_4.kt
│   ├── P1_5.kt
│   ├── P1_6.kt
│   ├── P1_7.kt
│   ├── P1_8.kt
│   └── P1_9.kt
└── README.md
```

> 📌 File names above are suggestions — rename them to match the files in your repo.

## 🚀 Getting Started

### Prerequisites
- IntelliJ IDEA (Community Edition is enough) **or** Android Studio
- JDK 17 or above
- Kotlin plugin (bundled with both IDEs)

### Run in IntelliJ IDEA
```bash
# 1. Clone the repository
git clone https://github.com/Prince-Prajapati-Maheshbhai/25172022054_mad_practical1.git

# 2. Open the folder in IntelliJ IDEA
# 3. Open any program file and click the ▶ icon next to fun main()
```

### Run from the terminal (optional)
```bash
kotlinc Program01_Variables.kt -include-runtime -d program1.jar
java -jar program1.jar
```

## 📚 Concepts Covered

- Variables, data types and type inference
- String templates and concatenation
- Reading console input and type conversion
- Null safety basics (`String?`, `!!`)
- `if` and `when` expressions
- Functions with parameters and return values
- `for` loops and ranges
- Arrays, nested arrays and `ArrayList`
- Operator overloading
- Classes, constructors (primary and secondary) and inheritance

## 👤 Author

**Prajapati Prince Maheshbhai**

Enrollment No.: 25172022054
