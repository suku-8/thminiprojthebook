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
import thminiprojthebook.domain.UserRegistered;

@Entity
@Table(name = "User_table")
@Data
//<<< DDD / Aggregate Root
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String loginId;

    private String loginPassword;

    private String name;

    private String isKt;

    private String isSubscribe;

    private Integer pointBalance;

    @ElementCollection
    private List<Long> bookId;

    private Date subscriptionDate;

    @PostPersist
    public void onPostPersist() {
        UserRegistered userRegistered = new UserRegistered(this);
        userRegistered.publishAfterCommit();
    }

    public static UserRepository repository() {
        UserRepository userRepository = SubscribemanageApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }

    //<<< Clean Arch / Port Method
    public void subscribeToBookService() {
        //implement business logic here:

        BookServiceSubscribed bookServiceSubscribed = new BookServiceSubscribed(
            this
        );
        bookServiceSubscribed.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void buyBook() {
        //implement business logic here:

        BuyBookSub buyBookSub = new BuyBookSub(this);
        buyBookSub.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void updateUser() {
        //implement business logic here:

        UserUpdated userUpdated = new UserUpdated(this);
        userUpdated.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void cancelSubscribeToBookService() {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void pointSyncPolicy(PointDecreased pointDecreased) {
        //implement business logic here:

        /** Example 1:  new item 
        User user = new User();
        repository().save(user);

        */

        /** Example 2:  finding and process
        

        repository().findById(pointDecreased.get???()).ifPresent(user->{
            
            user // do something
            repository().save(user);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void pointSyncPolicy(PointRecharged pointRecharged) {
        //implement business logic here:

        /** Example 1:  new item 
        User user = new User();
        repository().save(user);

        */

        /** Example 2:  finding and process
        

        repository().findById(pointRecharged.get???()).ifPresent(user->{
            
            user // do something
            repository().save(user);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void pointSyncPolicy(
        KtSignedupPointCharged ktSignedupPointCharged
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        User user = new User();
        repository().save(user);

        */

        /** Example 2:  finding and process
        

        repository().findById(ktSignedupPointCharged.get???()).ifPresent(user->{
            
            user // do something
            repository().save(user);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void pointSyncPolicy(
        StandardSignedupPointCharged standardSignedupPointCharged
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        User user = new User();
        repository().save(user);

        */

        /** Example 2:  finding and process
        

        repository().findById(standardSignedupPointCharged.get???()).ifPresent(user->{
            
            user // do something
            repository().save(user);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
