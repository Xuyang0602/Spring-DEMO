package Demo;

public class BasketballCoach implements Coach{
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
