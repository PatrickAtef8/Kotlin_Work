class Individual(
    var fullName: String,
    val identification: Int,
    val genderIdentity: String
) {
    fun showDetails() {
        println("Individual Details: Name=$fullName, ID=$identification, Gender=$genderIdentity")
    }

    fun modifyName(newName: String) {
        fullName = newName
    }
}

fun main() {
    //  let
    val letIndividual = Individual("Patrick Maged", 1, "Male").let {
        it.modifyName("Patrick Atef")
        "New name is ${it.fullName}"
//        100
//        "hello"
//        "hi"
    }
    println("let result: $letIndividual\n")

    // run
    val runIndividual = Individual("Omar Ahmed", 2, "Male").run {
        println("Using run: $fullName is $genderIdentity")
        modifyName("Omar Alaa")
        println("Using run modified name: $fullName")
        fullName.length
        100
        200

    }
    println("run result: $runIndividual\n")


    // with
    val withIndividual = Individual("Abdallah Youssef", 3, "Male")
    val description = with(withIndividual) {
        println("Using with: $fullName has ID $identification")
        modifyName("Abdallah Salah")
        "$fullName identifies as $genderIdentity"
    }
    println("with result: $description")
    withIndividual.showDetails()
    println("HI\n")
    100


    // apply
    val applyIndividual = Individual("Yasmeen Omar", 4, "Female").apply {
        modifyName("Yasmeen Yasser")
    }
    println("apply result:")
      applyIndividual.showDetails()

    // also
    val alsoIndividual = Individual("Ahmed Mohamed", 5, "Male").also {
        it.modifyName("Ahmed Mazen")
    }
    println("also result:")
       alsoIndividual.showDetails()
}