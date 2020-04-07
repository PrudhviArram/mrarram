
package edu.fcs;


public class PushdownAutomatonTest {

    public static void main(String[] args) {
        PushdownState q0 = new PushdownState("q0");

        PushdownState q1 = new PushdownState("q1");
        PushdownState q2 = new PushdownState("q2");
        PushdownState q3 = new PushdownState("q3");
        q3.setFinal();

        q0.addTransition("a", "Z", "aZ", q1);
        q1.addTransition("a", "a", "aa", q1);
        q1.addTransition("b", "a", "", q2);
        q2.addTransition("b", "a", "", q2);
        

        PushdownAutomaton pda = new PushdownAutomaton(q0, 'a', 'b',' ');
        
        System.out.println("Is valid (aabb)?:" + pda.testWord("aabb").isValid());
    }
}
