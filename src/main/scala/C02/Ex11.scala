package C02

import java.time.LocalDate


object Ex11 {

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length != 3 || !isWellFormatted(sc))
        throw new IllegalArgumentException("Misformatted date")
      else {
        // Why does he want us to check that all args are Integers, then convert them to Strings,
        //   then convert them back to Integers?
        // I want to do something like: LocalDate.of(args:_*)
        LocalDate.of(args(0).toString.toInt, args(1).toString.toInt, args(2).toString.toInt)
      }
    }

    private def isWellFormatted(sc: StringContext): Boolean = {
      sc.parts(0).isEmpty &&
        sc.parts(3).isEmpty &&
        sc.parts.slice(1, 2).forall(_ == "-")
    }
  }

}
