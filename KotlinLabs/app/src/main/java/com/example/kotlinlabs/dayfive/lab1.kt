package com.example.kotlinlabs.dayfive


open class LibraryItem(val title: String, val isbn: String, val publication: String, val numberOfPages: Int, var available: Boolean = true) {

    fun isAvailable(): Boolean {
        return available
    }
}

class Book(title: String, isbn: String, publication: String, numberOfPages: Int) :
    LibraryItem(title, isbn, publication, numberOfPages)



open class Person(val name: String, val id: String)

class Librarian(name: String, id: String, val password: String) : Person(name, id)

class User(name: String, id: String, val job: String) : Person(name, id)

class LibraryDatabase(private val librarian: Librarian) {
     val availableBooks = mutableListOf<LibraryItem>()
     val borrowedBooks = mutableMapOf<LibraryItem, User>()

    fun addBook(book: LibraryItem) {
        availableBooks.add(book)
    }

    /**trying single expression**/
    // Shorthand lambda:
    // fun lendBook(book: LibraryItem, user: User): Boolean = if (book in availableBooks && book.isAvailable()) {
    //         availableBooks.remove(book)
    //         book.available = false
    //         borrowedBooks[book] = user
    //         true
    //     } else {
    //         false
    //     }

    fun lendBook(book: LibraryItem, user: User): Boolean {
        return if (book in availableBooks && book.isAvailable()) {
            availableBooks.remove(book)
            book.available = false
            borrowedBooks[book] = user
            true
        } else {
            false
        }
    }


    /**the normal one **/
    fun receiveBookFromBorrower(book: LibraryItem): Boolean {
        val borrower = borrowedBooks.remove(book)
        return if (borrower != null) {
            book.available = true
            availableBooks.add(book)
            true
        } else {
            false
        }
    }

    fun viewAvailableBooks(): List<LibraryItem> {
        return availableBooks.toList()
    }

    fun searchForBook(title: String): List<LibraryItem> {
        return availableBooks.filter {
             it.title.contains(title, ignoreCase = true)

//            val currentTitle = it.title
//            currentTitle.contains(title, ignoreCase = true)
        }
    }

     fun getBorrowedBooksList(): Map<LibraryItem, User> = borrowedBooks

//    fun getBorrowedBooks(): Map<LibraryItem, User> {
//        return borrowedBooks
//    }
}

fun main() {
    val librarian = Librarian("Omar", "001", "123")
    val user = User("Patrick", "002", "Developer")

    val db = LibraryDatabase(librarian)

    val book1 = Book("Kotlin", "12345", "IdontKnow", 500)
    val book2 = Book("C++","1111","IdontKnow",200)
    val book3 = Book("Java", "0000", "IdontKnow", 600)


    db.addBook(book2)


    db.addBook(book1)
    db.addBook(book3)

    println("Available Books:")
    db.viewAvailableBooks().forEach {
        println(it.title)
    }

    db.lendBook(book1, user)
    println("\nAfter Lending ${book1.title} book")
    val availableBooks = db.viewAvailableBooks()
    for (book in availableBooks) {
        println(book.title)
    }

    println("\nBorrowed Books:")
    for ((book, borrower) in db.getBorrowedBooksList()) {
        println("${book.title} borrowed by ${borrower.name}")
    }

    db.receiveBookFromBorrower(book1)

    println("\nAfter Returning the Book:")
    db.viewAvailableBooks().forEach {
        // println(it.title)
        val item = it
        println(item.title)
    }

    db.searchForBook("Kotlin")
}