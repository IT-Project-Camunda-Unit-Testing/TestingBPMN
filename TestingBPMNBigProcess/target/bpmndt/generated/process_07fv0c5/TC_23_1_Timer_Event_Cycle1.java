package generated.process_07fv0c5;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_0imlm9c, Length: 3
 */
public class TC_23_1_Timer_Event_Cycle1 extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0jdxm8y;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0jdxm8y
    Activity_0jdxm8y = new UserTaskHandler(getProcessEngine(), "Activity_0jdxm8y");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_0jdxm8y
    assertThat(pi).isWaitingAt("Activity_0jdxm8y");
    instance.apply(Activity_0jdxm8y);
    assertThat(pi).hasPassed("Activity_0jdxm8y");

    // endEvent: Event_0imlm9c
    assertThat(pi).hasPassed("Event_0imlm9c");
  }

  @Override
  protected String getBpmnResourceName() {
    return "23-1-Timer-Event-Cycle.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_0imlm9c";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_07fv0c5";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_0jdxm8y
   */
  public UserTaskHandler handleActivity_0jdxm8y() {
    return Activity_0jdxm8y;
  }
}
