package ch19

import ch19.ex01.Bug

object ex02 {

  // can't declare object in all-lowercase because compiler complains that it's not a stable identifier.
  // Only happens for show, so it could be because of a conflict with some other meaning of the `show` identifier
  object Show

  val show = Show

  object Then

  val then = Then

  object Around

  val around = Around

  class FluentBug extends Bug {

    def and(x: Show.type): this.type = {
      show()
      this
    }

    def and(x: Then.type): this.type = {
      this
    }

    def turn(x: Around.type): this.type = {
      turn()
      this
    }
  }

}
