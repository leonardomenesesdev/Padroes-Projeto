//package Proxy;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BookSearchProxy {
//    private BookSearch bSearch;
//    private List<Book> cache;
//
//    public BookSearchProxy(BookSearch bSearch) {
//        this.bSearch = bSearch;
//        cache = new ArrayList<Book>();
//    }
//
//    public Book getBook(String isbn) {
//        Book b1 = null;
//        if (cache.isEmpty()) {
//            b1 = bSearch.getBook(isbn);
//            if (b1 != null) {
//                cache.add(b1);
//            }
//        } else {
//            for (Book b : cache) {
//                b1 = b.getIsbn() == isbn ? b : null;
//                if (b1 != null) {
//                    break;
//                }
//            }
//        }
//    }
//}
