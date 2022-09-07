public class Main {
    public static void main(String[] args) {
        String title = "Атлас Земли";
        Author innaSvetlova = new Author("Инна", "Светлова");
        int publishDate = 2004;
        Book atlasOfTheEarth = new Book(title, innaSvetlova, publishDate);
        System.out.println(atlasOfTheEarth);

        String titleTwo = "Мир вокруг";
        Author robertPinks = new Author("Роберт",  "Пинск");
        int publishDateTwo = 2002;
        Book theWorldAround = new Book(titleTwo, robertPinks, publishDateTwo);
        System.out.println(theWorldAround);
        Book theWorldAround2 = new Book(titleTwo, robertPinks, publishDateTwo);
        System.out.println(atlasOfTheEarth.equals(theWorldAround));
        System.out.println(theWorldAround.equals( theWorldAround2));
        System.out.println(theWorldAround.hashCode() == theWorldAround2.hashCode());

    }
}