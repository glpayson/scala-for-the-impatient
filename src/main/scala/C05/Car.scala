package C05

// Ex 08
class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, val licensePlate: String = "" ) {
  def this(manufacturer: String, modelName: String) = this(manufacturer, modelName, -1, "")
}
