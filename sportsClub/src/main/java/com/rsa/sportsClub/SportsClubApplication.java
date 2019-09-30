package com.rsa.sportsClub;

import com.rsa.sportsClub.pojo.Booking;
import com.rsa.sportsClub.pojo.Club;
import com.rsa.sportsClub.pojo.Game;
import com.rsa.sportsClub.pojo.Slot;
import com.rsa.sportsClub.pojo.User;
import com.rsa.sportsClub.repositories.BookingRepository;
import com.rsa.sportsClub.repositories.GameRepository;
import com.rsa.sportsClub.repositories.SlotRepository;
import com.rsa.sportsClub.repositories.UserRepository;
import com.rsa.sportsClub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.CustomConversions;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SportsClubApplication {


	public static void main(String[] args) {
		SpringApplication.run(SportsClubApplication.class, args);
	}
/*    @Bean
    public CustomConversions customConversions() {
        List<Converter<?, ?>> converters = new ArrayList<>();
        converters.add(DateToZonedDateTimeConverter.INSTANCE);
        converters.add(ZonedDateTimeToDateConverter.INSTANCE);
        return new CustomConversions(converters);
    }*/

	@Bean
	CommandLineRunner init(UserRepository userRepository, UserService userService,GameRepository gameRepository,SlotRepository slotRepository, BookingRepository bookingRepository){
	    return args -> {

            User user = new User("1234","Ram", "3B6");
            userRepository.save(user);
            System.out.println("user saved");

            List<User> list = userService.getAllUsers();
            list.forEach(System.out::println);

            Game game = new Game("badminton",new Club("IMG","Bangalore"),"imgBat1");
            gameRepository.save(game);

            slotRepository.deleteAll();
            LocalDateTime start = LocalDateTime.of(2019,12,12,10,30,0);
            LocalDateTime end = LocalDateTime.of(2019,12,12,11,30,0);
            ZonedDateTime start_zoda = start.atZone(ZoneId.of("Asia/Calcutta"));
            ZonedDateTime end_zoda = end.atZone(ZoneId.of("Asia/Calcutta"));
            Slot slot = new Slot(game, start,end);
            System.out.println(slot);
            slotRepository.save(slot);

            //ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
            bookingRepository.deleteAll();
            Booking booking = new Booking(game,slot,list);
            bookingRepository.save(booking);

        };
    }
}
