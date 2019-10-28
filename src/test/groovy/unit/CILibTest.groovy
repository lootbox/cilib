package unit

import com.example.ci.lib.CILib
import org.junit.Test

class CILibTest extends GroovyTestCase {
  def util

  void setUp() {
    util = new CILib(this)
  }

  @Test
  void testFindMatchesOnArray() {
    def ret = util.regMatch(
        "0123",
        "^[0-9]+\$"
    )

    assertEquals(ret, ["0", "1", "2", "3"])
    assertNotSame(ret, [0, 1, 2, 3])
    assertNotSame(ret, [0, 1, 2])
    assertNotSame(ret, ["0", "1", "2"])
    assertNotSame(ret, ["3", "0", "1", "2"])
  }

}
