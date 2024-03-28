package Day29;

import java.time.*;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.ZoneId;
// import java.time.ZonedDateTime;

public class dateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalDate d2 = d.plusDays(5);
        LocalDate d3 = LocalDate.parse("2001-12-11");
        System.out.println("The time right now is "+d3); //yyy-mm-dd

        LocalTime t = LocalTime.now();
        LocalTime t2 = t.plusHours(5);
        LocalTime t3 = LocalTime.of(17,5,10);
        System.out.println("time rn is "+t3);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        ZonedDateTime zt = ZonedDateTime.now(ZoneId.of("Europe/Athens"));
        System.out.println(zt);

        Period p = Period.between(d, d2);
        System.out.println("the period b/w dates are "+p.withYears(10));
    }
}
