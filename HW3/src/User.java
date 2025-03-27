/**
 * Represents a user within the system, storing essential details such as
 * username, password, and role.
 *
 * <p>Use {@link #setRole(String)} to update a user's role, and the getter
 * methods to retrieve their username, password, or role.</p>
 */
public class User {

    /** The username that identifies this user. */
    private String userName;

    /** The password associated with this user. */
    private String password;

    /** The role of this user (e.g., student, admin, etc.). */
    private String role;

    /**
     * Constructs a new {@code User} object with the specified username,
     * password, and role.
     *
     * @param userName the username for this user
     * @param password the password for this user
     * @param role     the role assigned to this user (e.g., student, admin)
     */
    public User(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
    
    /**
     * Sets the role of this user.
     *
     * @param role the new role to assign (e.g., student, admin)
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Retrieves the username of this user.
     *
     * @return the username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Retrieves the password of this user.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Retrieves the role of this user.
     *
     * @return the role
     */
    public String getRole() {
        return role;
    }
}
