package C06

// Ex 06, 07
object Suite extends Enumeration {
  type Suite = Value
  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")

  def isRed(suite: Suite): Boolean = suite == Diamond || suite == Heart
}

