package diabetic

object Module extends Serializable with Product {
  override def toString = "Module"

  override def productElement(n: Int): Any = ???

  override def productArity: Int = 0

  override def productPrefix: String = this.toString

  override def canEqual(that: Any): Boolean = ???
}