import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

object Test_Case extends AnyFlatSpec with Matchers {

  it should "match" in {
    assert(8 == MyUtil.divide(30, 3))
  }

  it should "match2" in {
    assert(15 == MyUtil.divide(30, 2))
  }

}
