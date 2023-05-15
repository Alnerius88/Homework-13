public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAuthor = firstName + lastName;

    public String getAuthor() {
        return firstName + lastName;
    }

    public String toString() {
        return firstName + lastName;
    }
    public int hashCode () {
        int result1 = firstName == null ? 0 : firstName.hashCode();
        int result2 = lastName == null ? 0 : lastName.hashCode();
        int result = result1 + result2;
        return result;
    }
    public boolean equals(Object author) {
        if (this == author)
        return true;
        else
        return false;
    }
}