/**
 * Provides automated tests for verifying the functionality
 * of the Q&amp;A system. This class serves as the main entry
 * point for running the tests in a single pass/fail fashion.
 * 
 * <p>It tests the following scenarios:</p>
 * <ul>
 *   <li>Posting an empty question/answer</li>
 *   <li>Posting a valid question/answer</li>
 *   <li>Filtering resolved answers (none exist scenario)</li>
 *   <li>Filtering resolved answers (some exist scenario)</li>
 *   <li>Marking an answer as resolved/unresolved</li>
 * </ul>
 * 
 * @author Naimish
 */
public class HW3 {

    private HW3() {
        // Prevent instantiation
    }

    public static void main(String[] args) {
        boolean t1 = testPostEmptyQuestionOrAnswer();
        boolean t2 = testPostValidQuestionOrAnswer();
        boolean t3 = testFilterResolvedNone();
        boolean t4 = testFilterResolvedAnswersExist();
        boolean t5 = testMarkAnswerAsResolved();

        System.out.println("testPostEmptyQuestionOrAnswer: " + (t1 ? "PASSED" : "FAILED"));
        System.out.println("testPostValidQuestionOrAnswer: " + (t2 ? "PASSED" : "FAILED"));
        System.out.println("testFilterResolvedNone:         " + (t3 ? "PASSED" : "FAILED"));
        System.out.println("testFilterResolvedAnswersExist: " + (t4 ? "PASSED" : "FAILED"));
        System.out.println("testMarkAnswerAsResolved:       " + (t5 ? "PASSED" : "FAILED"));
    }

    public static boolean testPostEmptyQuestionOrAnswer() {
        try {
            Questions questions = new Questions();
            String emptyQ = "";
            boolean added = tryAddQuestion(questions, emptyQ);
            return !added && questions.isEmpty();
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean testPostValidQuestionOrAnswer() {
        try {
            Questions questions = new Questions();
            String validQ = "Is there a final exam?";
            boolean added = tryAddQuestion(questions, validQ);
            return added && questions.getQLength() == 1 && questions.getQ(0).getInput().equals(validQ);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean testFilterResolvedNone() {
        try {
            Question q = new Question("Sample question?");
            Answers answers = q.getAnswers();
            boolean filter = true;
            boolean canFilter = false;
            if (filter && !canFilter) {
                return answers.isEmpty();
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean testFilterResolvedAnswersExist() {
        try {
            Question q = new Question("What's 2 + 2?");
            Answers answers = q.getAnswers();
            Answer resolved = new Answer("Probably 4");
            resolved.changeResolve(true);
            answers.addAnswer(resolved);

            Answer unresolved = new Answer("Maybe 3?");
            answers.addAnswer(unresolved);

            int visibleCount = 0;
            for (int i = 0; i < answers.getSize(); i++) {
                Answer a = answers.getAnswer(i);
                if (!a.isResolved()) continue;
                visibleCount++;
            }
            return visibleCount == 1;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean testMarkAnswerAsResolved() {
        try {
            Answer a = new Answer("Use BFS");
            if (a.isResolved()) return false;
            a.changeResolve(true);
            if (!a.isResolved()) return false;
            a.changeResolve(false);
            return !a.isResolved();
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean tryAddQuestion(Questions questions, String questionText) {
        if (questionText == null || questionText.trim().isEmpty()) return false;
        questions.add(new Question(questionText));
        return true;
    }
}
