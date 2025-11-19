void main(){


  boolean isRaining = false;

  if(isRaining) {
    IO.println("Regenschirm einpacken");
    IO.println("oder zuhause bleiben!");
  }


  int currentSpeed = 25;

  if (currentSpeed > 70 && currentSpeed <= 100)  {
    IO.println("Assozial!!! ");
  } else if(currentSpeed > 0 && currentSpeed <= 30){
    IO.println("Sehr gut in der Stadt");
  } else if (currentSpeed > 30 && currentSpeed <= 50)  {
    IO.println("Geschwindigkeit ist ok für die Stadt");
  } else if (currentSpeed > 50 && currentSpeed <= 70)  {
    IO.println("Zu schnell!");
  } else {
    IO.println("Ungültige Geschwindigkeit!");
  }


  IO.println("Ende");

}
