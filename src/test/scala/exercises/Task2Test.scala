package exercises

import org.junit.*
import org.junit.Assert.*
import u02.AlgebraicDataTypes.Person

class Task2Test:
  import u03.Sequences.*
  import Sequence.*
  import exercises.Task2.*

  @Test
  def testGetCoursesWithEmptySequence() =
    assertEquals(Nil(), getCourses(Nil()))
  
  @Test
  def testGetCoursesWithOneTeacher() =
    assertEquals(
      Cons("Matematica", Nil()),
      getCourses(Cons(Person.Teacher("Marco Rossi", "Matematica"), Nil()))
    )

  @Test
  def testGetCoursesWithMultipleTeachers() =
    assertEquals(
      Cons("Matematica", Cons("Fisica", Nil())),
      getCourses(Cons(Person.Teacher("Marco Rossi", "Matematica"), Cons(Person.Teacher("Luca Verdi", "Fisica"), Nil())))
    )
  
  @Test
  def testGetCoursesWithStudent() =
    assertEquals(
      Nil(),
      getCourses(Cons(Person.Student("Mario Bianchi", 2024), Nil()))
    )
  
  @Test
  def testGetCoursesWithMultipleStudents() =
    assertEquals(
      Nil(),
      getCourses(Cons(Person.Student("Mario Bianchi", 2024), Cons(Person.Student("Giovanni Neri", 2019), Nil())))
    )
  
  @Test
  def testGetCoursesWithMixedSequence() =
    assertEquals(
      Cons("Matematica", Cons("Fisica", Nil())),
      getCourses(
        Cons(Person.Student("Mario Bianchi", 2024),
          Cons(Person.Teacher("Marco Rossi", "Matematica"),
            Cons(Person.Student("Giovanni Neri", 2019),
              Cons(Person.Teacher("Luca Verdi", "Fisica"),
                Nil()
              )
            )
          )
        )
      )
    )
