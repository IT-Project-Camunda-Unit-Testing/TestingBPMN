package generated.process_07fv0c5;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.JobHandler;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: boundaryEvent: Event_1h31x47, Length: 3
 */
public class TC_23_1_Timer_Event_Cycle2 extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0jdxm8y;

  private JobHandler Event_1h31x47;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0jdxm8y
    Activity_0jdxm8y = new UserTaskHandler(getProcessEngine(), "Activity_0jdxm8y");
    Activity_0jdxm8y.waitForBoundaryEvent();

    // boundaryEvent: Event_1h31x47
    Event_1h31x47 = new JobHandler(getProcessEngine(), "Event_1h31x47");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_0jdxm8y
    assertThat(pi).isWaitingAt("Activity_0jdxm8y");
    instance.apply(Activity_0jdxm8y);
    instance.apply(Event_1h31x47);
    assertThat(pi).hasPassed("Activity_0jdxm8y");

    // boundaryEvent: Event_1h31x47
    assertThat(pi).hasPassed("Event_1h31x47");
  }

  @Override
  protected String getBpmnResourceName() {
    return "23-1-Timer-Event-Cycle.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1h31x47";
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

  /**
   * Returns the handler for boundaryEvent: Event_1h31x47 attached to userTask: Activity_0jdxm8y
   *
   * @see #handleActivity_0jdxm8y
   */
  public JobHandler handleEvent_1h31x47() {
    return Event_1h31x47;
  }
}
