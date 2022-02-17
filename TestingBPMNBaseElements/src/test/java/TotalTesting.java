
import generated.process_021xizn.TC_07_Aufgabe_Skript;
import generated.process_03zhach.TC_02_Aufgabe_Empfangen;
import generated.process_07fv0c5.TC_23_1_Timer_Event_Cycle1;
import generated.process_07fv0c5.TC_23_1_Timer_Event_Cycle2;
import generated.process_09ftgd9.TC_23_2_Timer_Event_Date1;
import generated.process_09ftgd9.TC_23_2_Timer_Event_Date2;
import generated.process_09wihne.TC_05_Aufgabe_Geschäftsregel;
import generated.process_0wukrdx.TC_04_Aufgabe_Manuell;
import generated.process_122zdl7.TC_24_Error_Event1;
import generated.process_122zdl7.TC_24_Error_Event2;
import generated.process_16rf89n.TC_11a_Gateway_XOR_true;
import generated.process_16rf89n.TC_11b_Gateway_XOR_false;
import generated.process_1cmsy6d.TC_a_senden;
import generated.process_1dxzyrd.TC_03_Aufgabe_Benutzer;
import generated.process_1ijt5ts.TC_12_2a_Gatways_AND_AND_a;
import generated.process_1iqjuag.TC_12_1a_Gateway_AND_XOR_PathA;
import generated.process_1iqjuag.TC_12_1b_Gateway_AND_XOR_PathB;
import generated.process_1j9q4qa.TC_25_Kompensation_Event1;
import generated.process_1jharh6.TC_23_3_Timer_Event_Duration1;
import generated.process_1jharh6.TC_23_3_Timer_Event_Duration2;
import generated.process_1s7lcah.TC_21_Message_Throw;
import generated.process_1vylsaa.TC_06_Aufgabe_Service;
import generated.process_1dxzyrd.TC_03_Aufgabe_Benutzer;
import generated.process_1vylsaa.TC_06_Aufgabe_Service;
import generated.process_16rf89n.TC_11a_Gateway_XOR_true;
import generated.process_1wq8eqm.TC_22_Nachricht_Fangen;
import org.camunda.community.bpmndt.api.CallActivityDefinition;
import org.camunda.community.bpmndt.api.CallActivityHandler;
import org.camunda.community.bpmndt.api.TestCaseExecutor;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Executor;


public class TotalTesting {

//------------------TASKS----------------------------
    // senden
    @Rule
    public TC_a_senden tc01 = new TC_a_senden();
    @Test
    public void tc01AufgabeSenden() { tc01.createExecutor().execute(); }

    // empfangen
    @Rule
    public TC_02_Aufgabe_Empfangen tc02 = new TC_02_Aufgabe_Empfangen();
    @Test
    public void tc02AufgabeAEmpfangen() { tc02.createExecutor().execute(); }

    // benutzer
    @Rule
    public TC_03_Aufgabe_Benutzer tc03 = new TC_03_Aufgabe_Benutzer();
    @Test
    public void tc03AufgabeBenutzer() { tc03.createExecutor().execute(); }

    // manuell
    @Rule
    public TC_04_Aufgabe_Manuell tc04 = new TC_04_Aufgabe_Manuell();
    @Test
    public void tc04AufgabeManuell() { tc04.createExecutor().execute(); }

    // Geschäftsregel
    @Rule
    public TC_05_Aufgabe_Geschäftsregel tc05 = new TC_05_Aufgabe_Geschäftsregel();
    @Test
    public void tc05AufgabeGeschäftsregel() { tc05.createExecutor().execute(); }

    // Service
    @Rule
    public TC_06_Aufgabe_Service tc06 = new TC_06_Aufgabe_Service();
    @Test
    public void tc06AufgabeService() { tc06.createExecutor().execute(); }

    // Skript
    @Rule
    public TC_07_Aufgabe_Skript tc07 = new TC_07_Aufgabe_Skript();
    @Test
    public void tc07AufgabeSkript() { tc07.createExecutor().execute(); }

//--------------------GATEWAYS----------------------
    // XOR
    // true
    @Rule
    public TC_11a_Gateway_XOR_true tc11a = new TC_11a_Gateway_XOR_true();
    @Test
    public void tc11aXORtrue() {
        tc11a.handleActivity_0qw1xmf().withVariable("check", true);
        tc11a.createExecutor().execute();

    }

    // false
    @Rule
    public TC_11b_Gateway_XOR_false tc11b = new TC_11b_Gateway_XOR_false();
    @Test
    public void tc11bXORfalse() {
        tc11b.handleActivity_0qw1xmf().withVariable("check", false);
        tc11b.createExecutor().execute();
    }

    // AND-XOR
    // Path A
    @Rule
    public TC_12_1a_Gateway_AND_XOR_PathA tc12_1a = new TC_12_1a_Gateway_AND_XOR_PathA();
    @Test
    public void tc12_1aAND_XORa() { tc12_1a.createExecutor().execute(); }

    // Path B
    @Rule
    public TC_12_1b_Gateway_AND_XOR_PathB tc12_1b = new TC_12_1b_Gateway_AND_XOR_PathB();
    @Test
    public void tc12_1bAND_XORb() { tc12_1b.createExecutor().execute(); }

    // AND-AND
    @Rule
    public TC_12_2a_Gatways_AND_AND_a tc12_2a = new TC_12_2a_Gatways_AND_AND_a();
    @Test
    public void tc12_2aAND_ANDa() { tc12_2a.createExecutor().execute(); }

//-------------------Events--------------
    // Intermediate Message Throw
    @Rule
    public TC_21_Message_Throw tc21 = new TC_21_Message_Throw();
    @Test
    public void tc21MessageThrow() { tc21.createExecutor().execute(); };

    // Intermediate Message Catch
    @Rule
    public TC_22_Nachricht_Fangen tc22 = new TC_22_Nachricht_Fangen();
    @Test
    public void tc22MessageCatch() { tc22.createExecutor().execute(); };





    // Timer-Cycle-Event 1
    @Rule
    public TC_23_1_Timer_Event_Cycle1 tc23_1_1 = new TC_23_1_Timer_Event_Cycle1();
    @Test
    public void tc23_1_1TimerCycleEvent() {
        tc23_1_1.createExecutor().execute();
    }

    // Timer-Cycle-Event 2
    @Rule
    public TC_23_1_Timer_Event_Cycle2 tc23_1_2 = new TC_23_1_Timer_Event_Cycle2();
    @Test
    public void tc23_1_2TimerCycleEvent() {
        tc23_1_2.createExecutor().execute();
    }


    // Timer-Date-Event 1
    @Rule
    public TC_23_2_Timer_Event_Date1 tc23_2_1 = new TC_23_2_Timer_Event_Date1();
    @Test
    public void tc23_2_1TimerDateEvent() {
        tc23_2_1.createExecutor().execute();
    }

    // Timer-Date-Event 2
    @Rule
    public TC_23_2_Timer_Event_Date2 tc23_2_2 = new TC_23_2_Timer_Event_Date2();
    @Test
    public void tc23_2_2TimerDateEvent() {
        tc23_2_2.createExecutor().execute();
    }

    // Timer-Duration-Event 1
    @Rule
    public TC_23_3_Timer_Event_Duration1 tc23_3_1 = new TC_23_3_Timer_Event_Duration1();
    @Test
    public void tc23_3_1TimerDurationEvent() {
        tc23_3_1.createExecutor().execute();
    }

    // Timer-Duration-Event 2
    @Rule
    public TC_23_3_Timer_Event_Duration2 tc23_3_2 = new TC_23_3_Timer_Event_Duration2();
    @Test
    public void tc23_3_2TimerDurationEvent() {
        tc23_3_2.createExecutor().execute();
    }



    // Error-Event-1

    @Rule
    public TC_24_Error_Event1 tc24_1 = new TC_24_Error_Event1();
    @Test
    public void tc24_1ErrorEvent() {
        tc24_1.handleActivity_1lput3k().withVariable("check",true);
        tc24_1.createExecutor().execute();
    }

    // Error-Event-1

    @Rule
    public TC_24_Error_Event2 tc24_2 = new TC_24_Error_Event2();
    @Test
    public void tc24_2ErrorEvent() {
        tc24_2.handleActivity_1lput3k().withVariable("check",false);
        tc24_2.createExecutor().execute();
    }

    // Kompensation-Event 1
    @Rule
    public TC_25_Kompensation_Event1 tc25_1 = new TC_25_Kompensation_Event1();
    @Test
    public void tc25_1KomensationEvent() {
        tc25_1.handleActivity_1idrajh().withVariable("check",false);
        tc25_1.createExecutor().execute();
    }




}


