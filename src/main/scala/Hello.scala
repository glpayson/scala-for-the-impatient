import com.google.gson.Gson

object Hello extends App {
  println("Hello, Scala!")
  val spock = SomePerson("Leonard", "Nimoy", 81)
  println(new Gson().toJson(spock))
}

