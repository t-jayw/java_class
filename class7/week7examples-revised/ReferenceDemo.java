class Book
{
   String title = "superclass book title";
   
   Book()
   {
      System.out.println("constructor for the superclass that takes no arg");
   }
   
   Book(Book b)
   {
      System.out.println("constructor for the superclass takes a book object");
   }

   String getTitle(Book b)
   {
      System.out.println("The getTitle method will return the title for the Book class and any of its subclasses, because inherit both title and the getTitle method.");
      return title;
   }
}

class MusicBook extends Book
{
    String musicBookTitle = "subclass book title";
}

class ReferenceDemo
{
   public static void main(String[] args)
   {
      Book myBook = new Book(new Book());
      System.out.println(myBook.title);
      
      MusicBook myMusicBook = new MusicBook();
      System.out.println(myMusicBook.title);
      
      System.out.println(myMusicBook.musicBookTitle);
      
      System.out.println("assigning a superclass reference variable to a subclass object reference");
      Book myBook2 = myMusicBook;
      System.out.println("Although the reference is of type Book, the object is of type MusicBook: " + myBook2.toString());
      
      System.out.println("inherited methods and fields remain available: ");
      System.out.println(myBook2.title); 
      
      System.out.println("However, the subclass methods and fields are NOT available to a reference of the superclass type");
     //System.out.println(myBook2.musicBookTitle);
   }
}