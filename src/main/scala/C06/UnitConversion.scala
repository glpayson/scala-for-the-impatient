package C06

// Ex 02
abstract class UnitConversion {
  def Convert(from: Double): Double
}

object InchesToCentimetres extends UnitConversion {
  override def Convert(from: Double): Double = {
    from * 2.54
  }
}

object GallonsToLitres extends UnitConversion {
  override def Convert(from: Double): Double = {
    from * 3.78541
  }
}

object MilesToKilometres extends UnitConversion {
  override def Convert(from: Double): Double = {
    from * 1.60934
  }
}