package generated.process_1jharh6;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.JobHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1lp31p0, Length: 3
 */
public class TC_23_3_Timer_Event_Duration1 extends AbstractJUnit4TestCase {
  private JobHandler Event_0bfn52v;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // intermediateCatchEvent: Event_0bfn52v
    Event_0bfn52v = new JobHandler(getProcessEngine(), "Event_0bfn52v");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // intermediateCatchEvent: Event_0bfn52v
    assertThat(pi).isWaitingAt("Event_0bfn52v");
    instance.apply(Event_0bfn52v);
    assertThat(pi).hasPassed("Event_0bfn52v");

    // endEvent: Event_1lp31p0
    assertThat(pi).hasPassed("Event_1lp31p0");
  }

  @Override
  protected String getBpmnResourceName() {
    return "23-3-Timer-Event-Duration.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1lp31p0";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1jharh6";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for intermediateCatchEvent: Event_0bfn52v
   */
  public JobHandler handleEvent_0bfn52v() {
    return Event_0bfn52v;
  }
}
