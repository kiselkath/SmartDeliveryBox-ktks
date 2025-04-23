public class TestSmartBox {
    public static void main(String[] args) {

        //test1
        SmartBox<Book> bookBox = new SmartBox<>();
        bookBox.addItem(new Book("Wizard of Oz", 55));
        bookBox.addItem(new Book("The little mermaid", 100));
        //System.out.println("New book added to the box " + bookBox.getItem().getBookTitle());

        //test2
        SmartBox<BoardGame> boardGameBox = new SmartBox<>();
        boardGameBox.addItem(new BoardGame("Milan Uprising"));
        //System.out.println("New board game added to the box " + boardGameBox.getItem().getGameTitle());

        //print with printBoxItem
        printBoxItem(bookBox);
        printBoxItem(boardGameBox);
    }
    //wildcards practice
    public static void printBoxItem(SmartBox<? extends Object> box) {
        Object item = box.getItem();
        System.out.println("Items in the box: " + item);
    }
}