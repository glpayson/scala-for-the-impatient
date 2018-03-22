package C04

import java.io.File
import java.util.Scanner

import scala.collection.mutable
import scala.collection.JavaConverters._

object Ex02 {
  def wordCount(): mutable.Map[String, Int] = {
    val wc = scala.collection.mutable.Map[String, Int]().withDefaultValue(0)
    val classLoader = getClass.getClassLoader
    val scanner = new Scanner(new File(classLoader.getResource("myfile.txt").getFile))
    while (scanner.hasNext())
      wc(scanner.next().toLowerCase()) += 1
    wc
  }

  def wordCountImmutable(): Map[String, Int] = {
    wordCount().toMap
  }

  def wordCountSorted(): mutable.SortedMap[String, Int] = {
    val sorted = mutable.SortedMap[String, Int]()
    sorted ++ wordCount()
  }

  def wordCountTreeMap(): mutable.Map[String, Int] = {
    val wc: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int].asScala
    wc ++ wordCount()
  }
}
