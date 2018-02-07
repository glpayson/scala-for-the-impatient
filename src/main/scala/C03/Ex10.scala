package C03

import java.util.TimeZone

object Ex10 {
  def americanTimeZones(): Array[String] = {
    TimeZone.getAvailableIDs()
      .filter(x => x.startsWith("America/"))
      .map(x => x.replaceFirst("America/", ""))
  }
}
