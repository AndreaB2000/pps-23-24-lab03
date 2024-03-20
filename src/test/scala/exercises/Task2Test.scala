package exercises

import org.junit.*
import org.junit.Assert.*

class Task2Test:
  import u03.Sequences.*
  import Sequence.*
  import exercises.Task2.*

  @Test
  def testGetCoursesWithEmptySequence() =
    assertEquals(Nil(), getCourses(Nil()))
