package generated.process_1wq8eqm;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.EventHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1be8z93, Length: 3
 */
public class TC_22_Nachricht_Fangen extends AbstractJUnit4TestCase {
  private EventHandler Event_0l0j3e1;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // intermediateCatchEvent: Event_0l0j3e1
    Event_0l0j3e1 = new EventHandler(getProcessEngine(), "Event_0l0j3e1", "FakeMessage");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // intermediateCatchEvent: Event_0l0j3e1
    assertThat(pi).isWaitingAt("Event_0l0j3e1");
    instance.apply(Event_0l0j3e1);
    assertThat(pi).hasPassed("Event_0l0j3e1");

    // endEvent: Event_1be8z93
    assertThat(pi).hasPassed("Event_1be8z93");
  }

  @Override
  protected String getBpmnResourceName() {
    return "22-Nachricht-Fangen.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1be8z93";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1wq8eqm";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for intermediateCatchEvent: Event_0l0j3e1
   */
  public EventHandler handleEvent_0l0j3e1() {
    return Event_0l0j3e1;
  }
}
