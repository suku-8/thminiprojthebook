package thminiprojthebook.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import thminiprojthebook.PointApplication;
import thminiprojthebook.domain.KtSignedupPointCharged;
import thminiprojthebook.domain.PointDecreased;
import thminiprojthebook.domain.StandardSignedupPointCharged;

@Entity
@Table(name = "Point_table")
@Data
//<<< DDD / Aggregate Root
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private Integer pointBalance;

    private String isKt;

    public static PointRepository repository() {
        PointRepository pointRepository = PointApplication.applicationContext.getBean(
            PointRepository.class
        );
        return pointRepository;
    }

    //<<< Clean Arch / Port Method
    public void pointRecharge() {
        //implement business logic here:

        PointRecharged pointRecharged = new PointRecharged(this);
        pointRecharged.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void pointDecrease(BuyBookSub buyBookSub) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        PointDecreased pointDecreased = new PointDecreased(point);
        pointDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(buyBookSub.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            PointDecreased pointDecreased = new PointDecreased(point);
            pointDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void pointDecrease(
        BookServiceSubscribed bookServiceSubscribed
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        PointDecreased pointDecreased = new PointDecreased(point);
        pointDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookServiceSubscribed.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            PointDecreased pointDecreased = new PointDecreased(point);
            pointDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void initialPointPolicy(UserRegistered userRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        StandardSignedupPointCharged standardSignedupPointCharged = new StandardSignedupPointCharged(point);
        standardSignedupPointCharged.publishAfterCommit();
        KtSignedupPointCharged ktSignedupPointCharged = new KtSignedupPointCharged(point);
        ktSignedupPointCharged.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(userRegistered.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            StandardSignedupPointCharged standardSignedupPointCharged = new StandardSignedupPointCharged(point);
            standardSignedupPointCharged.publishAfterCommit();
            KtSignedupPointCharged ktSignedupPointCharged = new KtSignedupPointCharged(point);
            ktSignedupPointCharged.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void ktSignedupPointPolicy(UserUpdated userUpdated) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        KtSignedupPointCharged ktSignedupPointCharged = new KtSignedupPointCharged(point);
        ktSignedupPointCharged.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(userUpdated.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            KtSignedupPointCharged ktSignedupPointCharged = new KtSignedupPointCharged(point);
            ktSignedupPointCharged.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
