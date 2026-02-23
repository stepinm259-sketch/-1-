
   class  Player {

   private String name;

   private int hp;

    private String username;

   private String color;


    public Player(String name, int hp, String username, String color) {
            this.name = name;
            this.hp = hp;
          this. username = username;
          this.color = color;
    }

       public Player(String name, String username, String color) {
           this.name = name;
           this.hp = 100;
           this. username = username;
           this.color = color;
       }
          public  String getUsername(){
             return  this.username;
          }

          public  void  setUsername(String username){
        if (!this.username.equals(username))
            this.username   = username;
          }


       public  String  getName() {
       return this.name;
       }


     private  void   minusHp(int hpforMinus){
        this.hp -= hpforMinus;
       }


       public  void  kick(Player player){
        player.minusHp(10);
       }




   }






