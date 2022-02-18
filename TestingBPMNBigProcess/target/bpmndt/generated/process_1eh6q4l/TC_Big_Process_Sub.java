package generated.process_1eh6q4l;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1djkp6o, Length: 3
 */
public class TC_Big_Process_Sub extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0hdn1j3;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0hdn1j3
    Activity_0hdn1j3 = new UserTaskHandler(getProcessEngine(), "Activity_0hdn1j3");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_0hdn1j3
    assertThat(pi).isWaitingAt("Activity_0hdn1j3");
    instance.apply(Activity_0hdn1j3);
    assertThat(pi).hasPassed("Activity_0hdn1j3");

    // endEvent: Event_1djkp6o
    assertThat(pi).hasPassed("Event_1djkp6o");
  }

  @Override
  protected String getBpmnResourceName() {
    return "Big-Process-Sub.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1djkp6o";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1eh6q4l";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_0hdn1j3
   */
  public UserTaskHandler handleActivity_0hdn1j3() {
    return Activity_0hdn1j3;
  }
}
