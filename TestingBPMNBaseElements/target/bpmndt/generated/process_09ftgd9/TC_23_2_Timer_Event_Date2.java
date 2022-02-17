package generated.process_09ftgd9;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.JobHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: intermediateCatchEvent: Event_0ibpb46, Length: 2
 */
public class TC_23_2_Timer_Event_Date2 extends AbstractJUnit4TestCase {
  private JobHandler Event_0ibpb46;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // intermediateCatchEvent: Event_0ibpb46
    Event_0ibpb46 = new JobHandler(getProcessEngine(), "Event_0ibpb46");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // intermediateCatchEvent: Event_0ibpb46
    assertThat(pi).isWaitingAt("Event_0ibpb46");
    instance.apply(Event_0ibpb46);
    assertThat(pi).hasPassed("Event_0ibpb46");
  }

  @Override
  protected String getBpmnResourceName() {
    return "23-2-Timer-Event-Date.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_0ibpb46";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_09ftgd9";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for intermediateCatchEvent: Event_0ibpb46
   */
  public JobHandler handleEvent_0ibpb46() {
    return Event_0ibpb46;
  }
}
