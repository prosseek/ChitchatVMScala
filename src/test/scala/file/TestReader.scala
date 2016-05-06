package file

import org.scalatest.FunSuite

class TestReader extends FunSuite {
  val testsourcesDir = "./src/test/resources/assembly_example/"
  test("read file (simple.asm) test") {
    val r = Reader(testsourcesDir + "simple.asm")
    assert(r.assemble().toString == "List(push 10, push 20, add, jmp 2, jmpc 4)")
  }
  test("arith file test") {
    val r = Reader(testsourcesDir + "arith.asm")
  }
}
