package generated.process_04q2mi0;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.CallActivityHandler;
import org.camunda.community.bpmndt.api.JobHandler;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1ajodif, Length: 4
 */
public class TC_26_Call_Activity_1 extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0wkapyd;

  private JobHandler Activity_1o70idhBefore;

  private CallActivityHandler Activity_1o70idh;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0wkapyd
    Activity_0wkapyd = new UserTaskHandler(getProcessEngine(), "Activity_0wkapyd");

    // callActivity: Activity_1o70idh
    Activity_1o70idhBefore = new JobHandler(getProcessEngine(), "Activity_1o70idh");

    // callActivity: Activity_1o70idh
    Activity_1o70idh = new CallActivityHandler(instance, "Activity_1o70idh");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_0wkapyd
    assertThat(pi).isWaitingAt("Activity_0wkapyd");
    instance.apply(Activity_0wkapyd);
    assertThat(pi).hasPassed("Activity_0wkapyd");

    // callActivity: Activity_1o70idh
    assertThat(pi).isWaitingAt("Activity_1o70idh");
    instance.apply(Activity_1o70idhBefore);
    assertThat(pi).hasPassed("Activity_1o70idh");

    // endEvent: Event_1ajodif
    assertThat(pi).hasPassed("Event_1ajodif");
  }

  @Override
  protected String getBpmnResourceName() {
    return "26-Call-Activity-1.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1ajodif";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_04q2mi0";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_0wkapyd
   */
  public UserTaskHandler handleActivity_0wkapyd() {
    return Activity_0wkapyd;
  }

  /**
   * Returns the handler for callActivity: Activity_1o70idh
   */
  public CallActivityHandler handleActivity_1o70idh() {
    return Activity_1o70idh;
  }
}
