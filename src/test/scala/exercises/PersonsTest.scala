package exercises

import org.junit.*
import org.junit.Assert.*
import u02.AlgebraicDataTypes.Person

class PersonsTest:
  import u03.Sequences.*
  import Sequence.*
  import exercises.Task2.*

  val marco: Person.Teacher = Person.Teacher("Marco Rossi", "Matematica")
  val luca: Person.Teacher = Person.Teacher("Luca Verdi", "Matematica")
  val mario: Person.Student = Person.Student("Mario Bianchi", 2024)
  val giovanni: Person.Student = Person.Student("Giovanni Neri", 2019)

  @Test
  def testGetCoursesWithEmptySequence() =
    assertEquals(Nil(), getCourses(Nil()))
  
  @Test
  def testGetCoursesWithOneTeacher() =
    assertEquals(
      Cons(marco.course, Nil()),
      getCourses(Cons(marco, Nil()))
    )

  @Test
  def testGetCoursesWithMultipleTeachers() =
    assertEquals(
      Cons(marco.course, Cons(luca.course, Nil())),
      getCourses(Cons(marco, Cons(luca, Nil())))
    )
  
  @Test
  def testGetCoursesWithStudent() =
    assertEquals(
      Nil(),
      getCourses(Cons(mario, Nil()))
    )
  
  @Test
  def testGetCoursesWithMultipleStudents() =
    assertEquals(
      Nil(),
      getCourses(Cons(mario, Cons(giovanni, Nil())))
    )
  
  @Test
  def testGetCoursesWithMixedSequence() =
    assertEquals(
      Cons(marco.course, Cons(luca.course, Nil())),
      getCourses(Cons(mario, Cons(marco, Cons(giovanni, Cons(luca, Nil())))))
    )
