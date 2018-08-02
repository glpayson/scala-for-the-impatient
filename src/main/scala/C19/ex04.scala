package ch19

import scala.collection.mutable.ArrayBuffer

object ex04 {

  class Network {

    class Member(val name: String) {
      val contacts = new ArrayBuffer[Member]

      // Couldn't figure out how to do it without this declaration
      // alternatively, just declare Member as a case class: the auto-generated equals would also be correct
      private def network: Network = Network.this

      override def equals(obj: scala.Any): Boolean = {
        if (!obj.isInstanceOf[Member]) false
        else {
          val otherMember = obj.asInstanceOf[Member]
          this.network == otherMember.network && this.name == otherMember.name
        }
      }

    }

    private val members =
      new ArrayBuffer[Member]

    def join(name: String): Member = {
      val m = new Member(name)
      members += m
      m
    }
  }

}
