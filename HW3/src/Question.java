/**
 * Represents a single question asked by a user, holding its text input
 * and a collection of answers associated with it.
 *
 * <p>The {@link #answers} field is automatically initialized, so that
 * any {@code Answer} objects related to this question can be managed
 * through {@link #getAnswers()}.</p>
 */
public class Question {

    /** The text content of this question. */
    private String input;

    /** The collection of answers for this question. */
    private Answers answers = new Answers(this);

    /**
     * Constructs a {@code Question} with the given text input.
     *
     * @param input the text content of this question
     */
    public Question(String input) {
        this.input = input;
    }

    /**
     * Retrieves the current text content of this question.
     *
     * @return the question text
     */
    public String getInput() {
        return input;
    }

    /**
     * Fetches the {@link Answers} collection that belongs to this question.
     * <p>
     * This method provides direct access to the list of answers, allowing
     * you to add, remove, or retrieve individual {@link Answer} objects.
     * </p>
     *
     * @return the {@code Answers} object associated with this question
     */
    public Answers getAnswers() {
        return answers;
    }

    /**
     * Sets or updates the text content of this question.
     *
     * @param input the new text for this question
     */
    public void setInput(String input) {
        this.input = input;
    }
}
