package util

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{FunSuite, Matchers}

trait MyTestsSuite extends FunSuite
  with Matchers // Enables `should` syntax
  with TypeCheckedTripleEquals // strict type checking when applying `===` op