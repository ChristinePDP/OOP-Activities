public class Encapsulation {

    public static void main(String[] args){
    
        Student student1 = new Student();
        student1.setId(2314074);
        student1.setName("De Padua, Christine P.");
        System.out.println("Stud ID: " + student1.getId());
        System.out.println("Stud Name: " + student1.getName());
        System.out.println();

        Book book1 = new Book();
        book1.setAuthor("Maxinejiji");
        book1.setBookNumber(125340);
        book1.setPrice(1234.00);
        book1.setTitle("He's into her");
        System.out.println("Book No.: " + book1.getBookNumber());
        System.out.println("Book Author: " + book1.getAuthor());
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Book Price: " + book1.getPrice());
        System.out.println();
    }
}