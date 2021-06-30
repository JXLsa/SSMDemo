import com.edu.smxy.entity.Book;
import com.edu.smxy.service.imp.BookServiceimp;
import org.junit.Test;


import java.util.List;

public class test {
    private BookServiceimp bookServiceimp;
    @Test
    public  void  mytest1(){

        List<Book> books=bookServiceimp.queryList(1,3,new Book("四级通关","c"));
        for (int i=0;i<books.size();i++){
            System.out.println(books.get(i).toString());
        }

    }

}
