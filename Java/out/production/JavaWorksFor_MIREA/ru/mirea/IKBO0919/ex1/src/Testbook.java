public class Testbook {
    public static void main(String[] args) {
        Book d1 = new Book("Mike", 252);
        Book d2 = new Book("Helen", 7741);
        Book d3 = new Book("Bob", 356);
        d3.setPage(1);
        System.out.println(d1);
        d1.Panelist();
        d2.Panelist();
        d3.Panelist();
    }
}
