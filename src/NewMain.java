public class NewMain {
    public static void main (String [] args ) {
        Author rHoward = new Author ("Robert ", "Howard ");
        Book phoenix = new Book ("The Phoenix on the Sword", rHoward, 1932 );
        phoenix.setPublicationYear(1933);
        System.out.println("phoenix = " + phoenix.getPublicationYear());
    }
}