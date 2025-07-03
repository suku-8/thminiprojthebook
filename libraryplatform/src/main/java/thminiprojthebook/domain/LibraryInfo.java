package thminiprojthebook.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import thminiprojthebook.LibraryplatformApplication;
import thminiprojthebook.domain.BestsellerGiven;
import thminiprojthebook.domain.Published;

@Entity
@Table(name = "LibraryInfo_table")
@Data
//<<< DDD / Aggregate Root
public class LibraryInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    private Long authorId;

    private String authorName;

    private String title;

    private String imageUrl;

    private String summary;

    private String context;

    private String classificationType;

    private Date publishDate;

    private Long selectCount;

    private Integer rank;

    private Boolean bestseller;

    public static LibraryInfoRepository repository() {
        LibraryInfoRepository libraryInfoRepository = LibraryplatformApplication.applicationContext.getBean(
            LibraryInfoRepository.class
        );
        return libraryInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void buyBookIncrease(BuyBookSub buyBookSub) {
        //implement business logic here:

        /** Example 1:  new item 
        LibraryInfo libraryInfo = new LibraryInfo();
        repository().save(libraryInfo);

        BestsellerGiven bestsellerGiven = new BestsellerGiven(libraryInfo);
        bestsellerGiven.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(buyBookSub.get???()).ifPresent(libraryInfo->{
            
            libraryInfo // do something
            repository().save(libraryInfo);

            BestsellerGiven bestsellerGiven = new BestsellerGiven(libraryInfo);
            bestsellerGiven.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void publish(AiSummarized aiSummarized) {
        //implement business logic here:

        /** Example 1:  new item 
        LibraryInfo libraryInfo = new LibraryInfo();
        repository().save(libraryInfo);

        Published published = new Published(libraryInfo);
        published.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if aiSummarized.aiGpt4_1MiniId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> contentAnalyzerMap = mapper.convertValue(aiSummarized.getAiGpt4_1MiniId(), Map.class);

        repository().findById(aiSummarized.get???()).ifPresent(libraryInfo->{
            
            libraryInfo // do something
            repository().save(libraryInfo);

            Published published = new Published(libraryInfo);
            published.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void publish(CoverCreated coverCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        LibraryInfo libraryInfo = new LibraryInfo();
        repository().save(libraryInfo);

        Published published = new Published(libraryInfo);
        published.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if coverCreated.aiDallEId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> coverDesignMap = mapper.convertValue(coverCreated.getAiDallEId(), Map.class);

        repository().findById(coverCreated.get???()).ifPresent(libraryInfo->{
            
            libraryInfo // do something
            repository().save(libraryInfo);

            Published published = new Published(libraryInfo);
            published.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
