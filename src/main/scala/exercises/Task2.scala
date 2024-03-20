package exercises

import u03.Sequences.Sequence
import u03.Sequences.Sequence.map
import u03.Sequences.Sequence.filter
import u02.AlgebraicDataTypes.Person

object Task2 extends App:
  def getCourses(persons: Sequence[Person]): Sequence[String] =
    map(persons)(person => person match
      case Person.Teacher(_, course) => course
      case _ => ""
    )