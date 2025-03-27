import java.util.ArrayList;

/**
 * Manages a dynamic list of {@link Question} objects, providing basic
 * CRUD (Create, Read, Update, Delete) operations, including methods
 * to add, remove, and retrieve questions.
 */
public class Questions {

    /** The internal list that stores all {@link Question} objects. */
    private ArrayList<Question> questions;

    /**
     * Constructs a new {@code Questions} object with an empty list
     * of questions.
     */
    public Questions() {
        questions = new ArrayList<>();
    }

    /**
     * Retrieves the {@link Question} at the specified index.
     *
     * @param i the index of the question to retrieve
     * @return the question at index {@code i}
     * @throws IndexOutOfBoundsException if {@code i} is out of range
     */
    public Question getQ(int i) {
        return questions.get(i);
    }

    /**
     * Adds a new {@link Question} to this collection.
     *
     * @param question the question to add
     */
    public void add(Question question) {
        questions.add(question);
    }

    /**
     * Removes the specified {@link Question} from this collection, if present.
     *
     * @param question the question to remove
     */
    public void remove(Question question) {
        questions.remove(question);
    }

    /**
     * Returns the total number of questions in this collection.
     *
     * @return the size of this questions list
     */
    public int getQLength() {
        return questions.size();
    }

    /**
     * Checks if this collection currently contains any questions.
     *
     * @return {@code true} if there are no questions; {@code false} otherwise
     */
    public boolean isEmpty() {
        return questions.isEmpty();
    }
}
