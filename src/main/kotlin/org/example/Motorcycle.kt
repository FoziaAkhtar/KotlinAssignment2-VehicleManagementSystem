package org.example

// ************************************************************
// Assignment 2
// Challenge A
// Subclass: Motorcycle
// ===========================================================
// Motorcycle inherits from Vehicle.
// Motorcycle also implements Drivable.
// ************************************************************

class Motorcycle(

    // Properties inherited from Vehicle
    brand: String,
    model: String,
    year: Int,

    // Motorcycle's own property
    val engineSize: Int

) : Vehicle(brand, model, year), Drivable {


    // Override Vehicle function
    // This demonstrates polymorphism
    override fun displayInfo() {

        println("---- Motorcycle Information ----")

        // Call parent class function
        super.displayInfo()

        println("Engine Size: ${engineSize}cc")

    }


    // Implement Drivable interface function
    override fun drive() {

        println("$brand $model is riding on the highway.")

    }

}