import java.util.ArrayList;

/**
 * Manages a list of {@link Answer} objects that belong to a specific {@link Question}.
 * <p>
 * This class provides basic CRUD operations for adding, removing, and retrieving 
 * {@code Answer} objects, as well as checking whether the list is empty or 
 * retrieving its size.
 * </p>
 */
public class Answers {

    /** The internal list of {@link Answer} objects. */
    private ArrayList<Answer> answers = new ArrayList<>();

    /** The {@link Question} to which all these answers are related. */
    private Question question;
    
    /**
     * Constructs an {@code Answers} object associated with the specified {@link Question}.
     *
     * @param question the question that these answers belong to
     */
    public Answers(Question question) {
        this.question = question;
    }
    
    /**
     * Adds a new {@link Answer} to the list.
     *
     * @param answer the answer to be added
     */
    public void addAnswer(Answer answer) {
        answers.add(answer);
    }
    
    /**
     * Retrieves the {@link Answer} at the specified index in the list.
     *
     * @param i the index of the answer to retrieve
     * @return the answer at index {@code i}
     */
    public Answer getAnswer(int i) {
        return answers.get(i);
    }
    
    /**
     * Returns the {@link Question} that these answers belong to.
     *
     * @return the associated question
     */
    public Question getQuestion() {
        return question;
    }
    
    /**
     * Removes the specified {@link Answer} from the list.
     *
     * @param answer the answer to remove
     */
    public void removeAnswer(Answer answer) {
        answers.remove(answer);
    }
    
    /**
     * Checks whether there are any answers in the list.
     *
     * @return {@code true} if the list of answers is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return answers.isEmpty();
    }
    
    /**
     * Returns the number of answers currently in the list.
     *
     * @return the size of the answers list
     */
    public int getSize() {
        return answers.size();
    }
}
