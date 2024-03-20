package exercises

import org.junit.*
import org.junit.Assert.*

class FoldLeftTest:
  import exercises.Task2.foldLeft
  import u03.Sequences.Sequence.*

  val defaultValue: Int = 0
  val operator: (Int, Int) => Int = _ + _

  @Test
  def testFoldLeftWithEmptySequence() =
    assertEquals(0, foldLeft(Nil())(defaultValue)(operator))
  
  @Test
  def testFoldLeftWithOneElementSequence() =
    assertEquals(1, foldLeft(Cons(1, Nil()))(defaultValue)(operator))
  
  @Test
  def testFoldLeftWithMoreElementsSequence() =
    assertEquals(6, foldLeft
      (Cons(1, Cons(2, Cons(3, Nil()))))
      (defaultValue)
      (operator)
    )
