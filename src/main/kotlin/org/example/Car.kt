package org.example

// ************************************************************
// Assignment 2
// Challenge A
// Subclass: Car
// ===========================================================
// Car inherits from Vehicle.
// Car also implements Drivable.
// ************************************************************

class Car(

    // Properties inherited from Vehicle
    brand: String,
    model: String,
    year: Int,

    // Car's own property
    val numberOfDoors: Int

) : Vehicle(brand, model, year), Drivable {


    // Override Vehicle's function
    // This demonstrates polymorphism
    override fun displayInfo() {

        println("---- Car Information ----")

        // Use the parent class function
        super.displayInfo()

        println("Number of Doors: $numberOfDoors")

    }


    // Implement Drivable interface function
    override fun drive() {

        println("$brand $model is driving on the road.")

    }

}