import org.junit.Assert.assertEquals

object DivideTest {


  @org.junit.Test
  def test() = {
    var expected = 10
    var actual = MyUtil.divide(30, 3)
    assertEquals(expected, actual)
  }

}
