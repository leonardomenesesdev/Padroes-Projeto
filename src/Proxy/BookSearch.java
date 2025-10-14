package Proxy;


public class BookSearch {
    public Book getBook(String isbn){
        Book b1 = null;
        if(isbn == "45"){
            b1 = new Book("Viagem ao centro da terra", isbn);
        } else{
            System.out.println("Buscando livro no banco");
            System.out.println("livro não encontrado");
        }
        return b1;
    }
}
