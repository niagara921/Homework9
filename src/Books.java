public class Books {
    public static void main(String[] args) {
        String title = "Атлас Земли";
        Author author = new Author("Инна", "Светлова");
        int publishDate = 2004;
        Book atlasOfTheEarth = new Book(title, author, publishDate);
        atlasOfTheEarth.setPublishDate(2000);
        System.out.println(atlasOfTheEarth);

        String titleTwo = "Мир вокруг";
        Author authorTwo = new Author("Роберт", "Пинск");
        int publishDateTwo = 2002;
        Book theWorldAround = new Book(titleTwo, authorTwo, publishDateTwo);
        System.out.println(theWorldAround);
    }
}
