package exercises

import org.junit.*
import org.junit.Assert.*
import exercises.StreamsTask.takeWhile

class StreamsTaskTest:
  import u03.Streams.*
  import u03.Streams.Stream.*

  @Test
  def testTakeWhileFalse() =
    val a = Stream.iterate(0)(_)
    assertEquals(
      Stream.toList(
        Stream.take(
          Stream.iterate(0)(_)
        )
        (1)
      )[0],
      Stream.toList(takeWhile(a)(false))[0]
    )
