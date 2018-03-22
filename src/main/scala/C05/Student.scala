package C05

import scala.beans.BeanProperty

// Ex 05
class Student (@BeanProperty var name: String, @BeanProperty var id: Long) {
}

//Compiled from "Student.scala"
//public class C05.Student {
//  private java.lang.String name;
//  private long id;
//  public java.lang.String name();
//  public void name_$eq(java.lang.String);
//  public long id();
//  public void id_$eq(long);
//  public long getId();
//  public java.lang.String getName();
//  public void setId(long);
//  public void setName(java.lang.String);
//  public C05.Student(java.lang.String, long);
//}
