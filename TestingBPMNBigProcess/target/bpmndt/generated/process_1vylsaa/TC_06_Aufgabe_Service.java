package generated.process_1vylsaa;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_09e8ct6, Length: 3
 */
public class TC_06_Aufgabe_Service extends AbstractJUnit4TestCase {
  @Override
  protected void starting(Description description) {
    super.starting(description);
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // serviceTask: Activity_10o34ng
    assertThat(pi).hasPassed("Activity_10o34ng");

    // endEvent: Event_09e8ct6
    assertThat(pi).hasPassed("Event_09e8ct6");
  }

  @Override
  protected String getBpmnResourceName() {
    return "06-Aufgabe-Service.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_09e8ct6";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1vylsaa";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }
}
