package classesandobjects.interfaces

data class Employee(
        // implementing 'name' is not required
        override val firstName: String,
        override val lastName: String
) : Person