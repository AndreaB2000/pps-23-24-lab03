package exercises

import org.junit.*
import org.junit.Assert.*

class FoldLeftTest:
  import exercises.Task2.foldLeft
  import u03.Sequences.Sequence.*

  @Test
  def testFoldLeftWithEmptySequence() =
    assertEquals(0, foldLeft(Nil())(0)(_ + _))
