package jenkins

import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class TestExampleProject extends BasePipelineTest {

  @Override
  @Before
  void setUp() {
    super.setUp()
    helper.registerAllowedMethod("sh", [Map.class], {c -> "bcc1970"})
  }

  @Test
  void should_execute_without_errors() throws Exception {
    def script = loadScript("src/main/groovy/com/example/ci/pipes/ExampleProject/Jenkinsfile")
    script.execute()
    printCallStack()
  }

}
