package diabetic

class LabelledPoint {
  var label: String = ""
  var x: Int = 0
  var y: Int = 0

  def this(label: String, x: Int, y: Int) {
    this()
    this.label = label
    this.x = x
    this.y = y
  }

  override def toString: String = s"LabelledPoint($label,$x,$y)"

  override def equals(obj: scala.Any): Boolean = obj match {
    case labelledPoint: LabelledPoint => {
      labelledPoint.label == label &&
      labelledPoint.x == x &&
      labelledPoint.y == y
    }
    case _ => throw new ClassCastException
  }

  override def hashCode(): Int = {
    val state = Seq(label, x, y)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object LabelledPoint {
  def apply(label: String, x: Int, y: Int) = new LabelledPoint(label, x, y)
}