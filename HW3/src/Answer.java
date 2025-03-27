/**
 * Represents a user's Answer, storing both the textual content and whether
 * it is marked as resolved.
 *
 * <p>Use {@link #changeResolve(boolean)} to mark this Answer as resolving
 * its corresponding Question, and {@link #isResolved()} to check if it has
 * been marked as resolved.</p>
 */
public class Answer { 

    /** The textual content of this Answer. */
    private String input;

    /** Whether this Answer is currently marked as resolved. */
    private boolean resolved;

    /**
     * Constructs a new Answer object with the given text.
     * Initially, the answer is not resolved.
     *
     * @param input the text content of this answer
     */
    public Answer(String input) {
        this.input = input;
        this.resolved = false;
    }
    
    /**
     * Returns the text content of this Answer.
     *
     * @return the text of this Answer
     */
    public String getInput() {
        return input;
    }
    
    /**
     * Marks or unmarks this Answer as resolving its corresponding Question.
     *
     * @param r true to mark this answer as resolved; false to mark it as unresolved
     */
    public void changeResolve(boolean r) {
        resolved = r;
    }
    
    /**
     * Checks whether this Answer is currently marked as resolved.
     *
     * @return true if resolved, false otherwise
     */
    public boolean isResolved() {
        return resolved;
    }
    
    /**
     * Updates the text content of this Answer.
     *
     * @param input the new text for this Answer
     */
    public void setInput(String input) {
        this.input = input;
    }
}
