package C06

// [17:08 C06] scalac WorldHello.scala                                                                                                                                        master  ✭
// [17:08 C06] scala C06.WorldHello hello sailor

// Ex 05
object WorldHello extends App {
  args.reverseMap(x => print(x + " "))
  println()
}
