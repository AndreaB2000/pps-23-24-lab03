package exercises

import u02.AlgebraicDataTypes.Person
import u03.Sequences.*
import u03.Sequences.Sequence.*

object Task2 extends App:
  def getCourses(persons: Sequence[Person]): Sequence[String] =
    map(filter(persons)(element =>
      element match
        case Person.Teacher(_, _) => true
        case _ => false)
    )(person => person match
      case Person.Teacher(_, course) => course
      case _ => ""
    )
  
  def getCoursesWithFlatMap(persons: Sequence[Person]): Sequence[String] =
    flatMap(persons)(person => person match
      case Person.Teacher(_, course) => Cons(course, Nil())
      case _ => Nil()
    )

  def foldLeft[A](l: Sequence[A])(defaultValue: A)(operator: (A, A) => A): A = l match
    case Cons(h, t) => operator(h, foldLeft(t)(defaultValue)(operator))
    case _ => defaultValue
  