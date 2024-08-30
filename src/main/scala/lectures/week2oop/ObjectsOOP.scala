package lectures.week2oop

object ObjectsOOP extends App {
  //  val employee = new Employee()
  //  println(s"${employee.name}'s salary is ${employee.salary}")
}

class Employee(val name: String, var salary: Double) {
  def this() = this("John", 0.0)
}

class Instructor(val id: Int, var name: String, var surname: String) {
  name = name.capitalize
  surname = surname.capitalize

  def fullName(): String = s"$name $surname"
}

class Course(val courseId: Int, val title: String, val releaseYear: String, val instructor: Instructor) {
  def getID: String = s"$courseId${instructor.id}"

  def isTaughtBy(instructor: Instructor): Boolean = this.instructor.equals(instructor)

  def copyCourse(newReleaseYear: String): Course = new Course(this.courseId, this.title, newReleaseYear, this.instructor)
}