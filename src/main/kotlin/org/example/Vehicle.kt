package org.example

// ************************************************************
// Assignment 2
// Challenge A
// Superclass: Vehicle
// ===========================================================
// This is the parent class.
// Other classes will inherit from Vehicle.
// ************************************************************

open class Vehicle(

    // Constructor properties
    val brand: String,
    val model: String,
    val year: Int

) {


    // Common function for all vehicles
    open fun displayInfo() {

        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")

    }

}