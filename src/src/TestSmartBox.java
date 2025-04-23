public class TestSmartBox {
    public static void main(String[] args) {

        //test1
        SmartBox<Book> bookBox = new SmartBox<>();
        bookBox.addItem(new Book("Wizard of Oz"));
        System.out.println("New book added to the box " + bookBox.getItem().getBookTitle());

        //test2
        SmartBox<BoardGame> boardGameBox = new SmartBox<>();
        boardGameBox.addItem(new BoardGame("Milan Uprising"));
        System.out.println("New board game added to the box " + boardGameBox.getItem().getGameTitle());

    }
}