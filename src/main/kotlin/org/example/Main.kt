package org.example

// ************************************************************
// Assignment 2
// Main File
// ============================================================
// This file demonstrates:
// - Constructors
// - Inheritance
// - Interface
// - Polymorphism
// - String Processing
// ************************************************************


// ************************************************************
// Assignment 2
// Challenge B
// ==========================================================
// String Function:
// This function counts the number of vowels
// inside a given String.
// ************************************************************

fun countVowels(text: String): Int {


    // Stores the number of vowels found
    var count = 0


    // Check every character in the String
    for (character in text) {


        // Convert character to lowercase
        // and check if it is a vowel
        if (
            character.lowercaseChar() == 'a' ||
            character.lowercaseChar() == 'e' ||
            character.lowercaseChar() == 'i' ||
            character.lowercaseChar() == 'o' ||
            character.lowercaseChar() == 'u'
        ) {

            count++

        }

    }


    // Return the final vowel count
    return count

}



// ************************************************************
// Main Function
//
// Creates objects and tests the program.
// ************************************************************

fun main() {


    // --------------------------------------------------------
    // Challenge A
    // Creating objects from subclasses
    // --------------------------------------------------------


    // Creating first object from Car class
    val myCar = Car(
        "Toyota",
        "Camry",
        2022,
        4
    )


    // Creating second object from Motorcycle class
    val myMotorcycle = Motorcycle(
        "Honda",
        "CBR500R",
        2021,
        500
    )


    // --------------------------------------------------------
    // Display Car information
    // --------------------------------------------------------

    myCar.displayInfo()

    // Calling interface function
    myCar.drive()



    println()



    // --------------------------------------------------------
    // Display Motorcycle information
    // --------------------------------------------------------

    myMotorcycle.displayInfo()

    // Calling interface function
    myMotorcycle.drive()



    println()



    // ********************************************************
    // Polymorphism Example
    //
    // Same parent type:
    // Vehicle
    //
    // Different child objects:
    // Car and Motorcycle
    // ********************************************************


    println("---- Polymorphism Example ----")


    val vehicles: List<Vehicle> = listOf(
        myCar,
        myMotorcycle
    )


    for (vehicle in vehicles) {

        vehicle.displayInfo()

        println()

    }



    // ********************************************************
    // Challenge B Test
    //
    // Calling the String function
    // ********************************************************


    println("---- Challenge B: String Function ----")


    val sentence = "Kotlin Programming"


    val vowelResult = countVowels(sentence)


    println("Sentence: $sentence")

    println("Number of vowels: $vowelResult")


}