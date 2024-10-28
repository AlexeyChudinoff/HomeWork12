public class Main {



  public static void main(String[] args) {

    Author pushkin = new Author("Aleksandr", "Pushkin");
    Author tolstoy = new Author("Lev", "Tolstoy");

    System.out.println(pushkin.getFirstName() + " " + pushkin.getLastName());
      System.out.println(tolstoy.getFirstName() + " " + tolstoy.getLastName());

    Book stihi = new Book("Stihi", pushkin, 1830);
    Book Rasskazi = new Book("Rasskazi i Shutki", tolstoy, 1900);

    System.out.println(stihi.getYearBook() + ", " +  pushkin.getFirstName() + " "
        + pushkin.getLastName() + ", " + stihi.getNameBook());
    System.out.println(Rasskazi.getYearBook() + ", " + tolstoy.getFirstName() + " "
        + tolstoy.getLastName() +", " + Rasskazi.getNameBook());

    stihi.setYearBook(1825);
    System.out.println("stihi = " + stihi.getYearBook());

    System.out.println(Rasskazi);
    System.out.println(tolstoy);



  }
}