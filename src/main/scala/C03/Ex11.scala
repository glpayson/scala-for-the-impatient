package C03

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

import scala.collection.JavaConverters._
import scala.collection.mutable

object Ex11 {
  def flavor(): mutable.Buffer[String] = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  }.asScala
}
