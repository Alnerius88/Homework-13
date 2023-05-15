public class Main {
    public static void main (String[] args) {
        Author rHoward = new Author ("Robert ", "Howard ");
        Author artConDoyle = new Author("Arthur ", "Conan Doyle ");
        Book phoenix = new Book("The Phoenix on the Sword ", rHoward, 1932);
        Book scarletStudy = new Book("A Study in Scarlet ", artConDoyle, 1887);
        System.out.println(phoenix.getBookName() + ", " + rHoward.getAuthor() + ", " + phoenix.getPublicationYear());
        System.out.println(scarletStudy.getBookName() + ", " + artConDoyle.getAuthor() + "," + scarletStudy.publicationYear);
        System.out.println(rHoward.getFirstName() + " " + rHoward.getLastName());
        System.out.println(artConDoyle.getFirstName() + " " + artConDoyle.getLastName());
        System.out.println(phoenix);
        System.out.println(phoenix.hashCode());
        System.out.println(scarletStudy.hashCode());
        System.out.println(rHoward.equals(artConDoyle));
        System.out.println(rHoward.equals(rHoward));
    }

}