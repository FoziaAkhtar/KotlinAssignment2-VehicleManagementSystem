
# Kotlin Assignment 2 - Vehicle Management System

## Overview

This project was created for Kotlin Assignment 2.

The application demonstrates Kotlin Object-Oriented Programming (OOP) concepts and String processing.

The project contains two challenges:

- Challenge A: Object-Oriented Vehicle Management System
- Challenge B: String Processing Function


---

# Challenge A - Vehicle Management System

## Description

This challenge creates a simple vehicle application using Kotlin classes, inheritance, interfaces, constructors, and polymorphism.

The application models different types of vehicles and demonstrates how child classes inherit and extend a parent class.


## Class Structure

```
                 Vehicle
              (Superclass)
                    |
        -------------------------
        |                       |
       Car               Motorcycle
    (Subclass)          (Subclass)
```


---

# Classes Created

## Vehicle.kt

`Vehicle` is the parent class (superclass).

It contains common vehicle properties:

- Brand
- Model
- Year

It also contains the `displayInfo()` function that can be overridden by subclasses.


---

## Car.kt

`Car` is a subclass of `Vehicle`.

Additional property:

- Number of doors

The class:

- Inherits vehicle information from `Vehicle`
- Implements the `Drivable` interface
- Overrides `displayInfo()`
- Provides its own driving behavior


---

## Motorcycle.kt

`Motorcycle` is a subclass of `Vehicle`.

Additional property:

- Engine size

The class:

- Inherits vehicle information from `Vehicle`
- Implements the `Drivable` interface
- Overrides `displayInfo()`
- Provides its own driving behavior


---

## Drivable.kt

`Drivable` is an interface.

It creates a rule that every vehicle must implement the `drive()` function.

Example:

```kotlin
fun drive()
```


---

# Kotlin Concepts Demonstrated

## Inheritance

Child classes inherit properties and functions from the parent class.

Example:

```kotlin
class Car(...) : Vehicle(...)
```


---

## Constructors

Classes receive information when objects are created.

Example:

```kotlin
Car(
    "Toyota",
    "Camry",
    2022,
    4
)
```


---

## Polymorphism

The same function can have different behaviors depending on the object.

Example:

```kotlin
displayInfo()
```

Car displays:

- Number of doors

Motorcycle displays:

- Engine size


---

## Interfaces

The `Drivable` interface ensures that all vehicles provide a driving function.

Example:

```kotlin
override fun drive()
```


---

# Challenge B - String Processing

## Description

This challenge creates a String function that counts the number of vowels in a given String.

Function:

```kotlin
fun countVowels(text: String): Int
```

The function:

- Accepts a String input
- Checks each character
- Counts vowels
- Returns the total number of vowels


Example:

Input:

```
Kotlin Programming
```

Output:

```
Number of vowels: 5
```


---

# Project Structure

```
KotlinAssignment2-VehicleManagementSystem

src
└── main
    └── kotlin
        └── org.example
            ├── Main.kt
            ├── Vehicle.kt
            ├── Car.kt
            ├── Motorcycle.kt
            └── Drivable.kt

build.gradle.kts
settings.gradle.kts
README.md
```


---

# How to Run the Project

1. Open the project in IntelliJ IDEA.

2. Open:

```
Main.kt
```

3. Run:

```
fun main()
```

4. The program will display:

- Vehicle information
- Driving actions
- Polymorphism demonstration
- Vowel counting result


---

# Technologies Used

- Kotlin
- IntelliJ IDEA
- Gradle


---

# Author

Fozia Akhtar
