package generated.process_03zhach;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.EventHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_19ackbq, Length: 3
 */
public class TC_02_Aufgabe_Empfangen extends AbstractJUnit4TestCase {
  private EventHandler Activity_01tmiqp;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // receiveTask: Activity_01tmiqp
    Activity_01tmiqp = new EventHandler(getProcessEngine(), "Activity_01tmiqp", "FakeMessage");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // receiveTask: Activity_01tmiqp
    assertThat(pi).isWaitingAt("Activity_01tmiqp");
    instance.apply(Activity_01tmiqp);
    assertThat(pi).hasPassed("Activity_01tmiqp");

    // endEvent: Event_19ackbq
    assertThat(pi).hasPassed("Event_19ackbq");
  }

  @Override
  protected String getBpmnResourceName() {
    return "02-AufgabeEmpfangen.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_19ackbq";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_03zhach";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for receiveTask: Activity_01tmiqp
   */
  public EventHandler handleActivity_01tmiqp() {
    return Activity_01tmiqp;
  }
}
