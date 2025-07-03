package thminiprojthebook.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import thminiprojthebook.SubscribemanageApplication;

@Entity
@Table(name = "Library_table")
@Data
//<<< DDD / Aggregate Root
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    private String title;

    private String authorName;

    private String imageUrl;

    private String summary;

    public static LibraryRepository repository() {
        LibraryRepository libraryRepository = SubscribemanageApplication.applicationContext.getBean(
            LibraryRepository.class
        );
        return libraryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void bookInfoPolicy(Published published) {
        //implement business logic here:

        /** Example 1:  new item 
        Library library = new Library();
        repository().save(library);

        */

        /** Example 2:  finding and process
        

        repository().findById(published.get???()).ifPresent(library->{
            
            library // do something
            repository().save(library);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
