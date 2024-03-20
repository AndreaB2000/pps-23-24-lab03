package exercises

import u02.AlgebraicDataTypes.Person
import u03.Sequences.*
import u03.Sequences.Sequence.*

object Task2 extends App:

  def getCourses(persons: Sequence[Person]): Sequence[String] =
    persons.getCoursesExt()
  
  def getCoursesWithFlatMap(persons: Sequence[Person]): Sequence[String] =
    persons.getCoursesWithFlatMapExt()

  def foldLeft[A](l: Sequence[A])(defaultValue: A)(operator: (A, A) => A): A = 
    l.foldLeftExt(defaultValue)(operator) 

  extension [A](l: Sequence[A])

    def getCoursesExt(): Sequence[String] =
      map(filter(l)(element =>
        element match
          case Person.Teacher(_, _) => true
          case _ => false)
      )(person => person match
        case Person.Teacher(_, course) => course
        case _ => ""
      )
    
    def getCoursesWithFlatMapExt(): Sequence[String] =
      flatMap(l)(person => person match
        case Person.Teacher(_, course) => Cons(course, Nil())
        case _ => Nil()
      )
    
    def foldLeftExt(defaultValue: A)(operator: (A, A) => A): A = l match
      case Cons(h, t) => operator(h, t.foldLeftExt(defaultValue)(operator))
      case _ => defaultValue
