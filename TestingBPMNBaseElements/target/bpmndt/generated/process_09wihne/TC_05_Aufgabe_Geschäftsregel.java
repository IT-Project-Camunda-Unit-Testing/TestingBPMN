package generated.process_09wihne;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_0fpkgci, Length: 3
 */
public class TC_05_Aufgabe_Geschäftsregel extends AbstractJUnit4TestCase {
  @Override
  protected void starting(Description description) {
    super.starting(description);
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // businessRuleTask: Activity_12oprnd
    assertThat(pi).hasPassed("Activity_12oprnd");

    // endEvent: Event_0fpkgci
    assertThat(pi).hasPassed("Event_0fpkgci");
  }

  @Override
  protected String getBpmnResourceName() {
    return "05-Aufgabe-Geschäftsregel.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_0fpkgci";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_09wihne";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }
}
