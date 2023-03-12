@RestContoller
@Profile("dev")
Class Contoller{
  
  
  @Value("${developmentMsg}")
  String developmentMsg;
  
  @PostConstrucotr
  public void UserDetrailsDevEnvirmnt(){
    
    System.out.println("It's from dev"+developmentMsg)
  }
  
}
