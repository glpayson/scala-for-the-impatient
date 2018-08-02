package ch19

import scala.language.reflectiveCalls

object ex07 {
  def processCloseable[T <: {def close() : Unit}, U](closeable: T, f: T => U): U = {
    try {
      f(closeable)
    } finally {
      closeable.close()
    }
  }
}