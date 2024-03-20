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
    assertEquals(Cons("Matematica", Nil()), getCourses(Cons(Person.Teacher("Marco Rossi", "Matematica"), Nil())))
