import java.io.PrintStream

import scala.scalajs.js
import scala.scalajs.js.annotation._

//@JSExportTopLevel("Main")
object Main {
  // ##### PDF-js specific code
  @inline def jsPrintln(any: Any): Unit = js.Dynamic.global.console.println(any.toString)
  Console.setOut(new PrintStream((i: Int) => jsPrintln(i.toChar)) {
    override def println(): Unit = jsPrintln("")
    override def println(x: AnyRef): Unit = jsPrintln(x)
  })

  // ##### user code ####

  /**
   * called when the document is openend
   */
  def main(args: Array[String]): Unit = {
    println(s"main() was called")
    js.Dynamic.global.console.show() // show console for debug purposes
  }

  /**
   * called when a button (link) is clicked
   */
  @JSExportTopLevel("click")
  def click(btnName: String): Unit = {
    println(s"click($btnName) was called")
  }
}
