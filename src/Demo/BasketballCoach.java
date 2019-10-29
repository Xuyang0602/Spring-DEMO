package Demo;

public class BasketballCoach implements Coach{

    // Add new fields for email address and team
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Basketball Coach: inside setter email Address");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Basketball Coach: inside setter team");
        this.team = team;
    }

    private FortuneService fortuneService;
    // Create a no-arg constructor
    public BasketballCoach() {
        System.out.println("Basketball Coach");
    }

    // Setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Basketball Coach: inside setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast dribbling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
