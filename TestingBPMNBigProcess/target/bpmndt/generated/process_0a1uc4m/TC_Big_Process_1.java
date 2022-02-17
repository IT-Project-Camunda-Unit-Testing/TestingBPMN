package generated.process_0a1uc4m;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1jmqwp3, Length: 3
 */
public class TC_Big_Process_1 extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0hi6mza;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0hi6mza
    Activity_0hi6mza = new UserTaskHandler(getProcessEngine(), "Activity_0hi6mza");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_0hi6mza
    assertThat(pi).isWaitingAt("Activity_0hi6mza");
    instance.apply(Activity_0hi6mza);
    assertThat(pi).hasPassed("Activity_0hi6mza");

    // endEvent: Event_1jmqwp3
    assertThat(pi).hasPassed("Event_1jmqwp3");
  }

  @Override
  protected String getBpmnResourceName() {
    return "Big-Process.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1jmqwp3";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_0a1uc4m";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_0hi6mza
   */
  public UserTaskHandler handleActivity_0hi6mza() {
    return Activity_0hi6mza;
  }
}
