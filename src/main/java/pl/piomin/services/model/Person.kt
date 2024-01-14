package pl.piomin.services.model

import javax.validation.constraints.Max
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.PositiveOrZero

data class Person(
    var id: @Max(10000) Int? = null,
    var firstName: @NotBlank String? = null,
    var lastName: @NotBlank String? = null,
    var age: @PositiveOrZero Int = 0,
    var gender: @NotNull Gender? = null
) {

    override fun toString(): String {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}'
    }

}
