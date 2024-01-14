package pl.piomin.services.model

import javax.validation.constraints.Max
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.PositiveOrZero

class Person {
    @kotlin.jvm.JvmField
    var id: @Max(10000) Int? = null
    var firstName: @NotBlank String? = null
    var lastName: @NotBlank String? = null
    var age: @PositiveOrZero Int = 0
    var gender: @NotNull Gender? = null

    constructor()
    constructor(id: Int?, firstName: String?, lastName: String?, age: Int, gender: Gender?) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
        this.gender = gender
    }

    override fun toString(): String {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}'
    }

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }
}
