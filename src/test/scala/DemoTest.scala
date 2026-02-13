class DemoTest extends munit.FunSuite {
  test("string operations") {
    val result = "hello".toUpperCase
    assertEquals(result, "HELLO")
  }

}
