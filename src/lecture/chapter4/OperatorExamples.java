void main(){

  int numberA = 13;
  int numberB = 5;
  int result;

  result = numberA % numberB;
  IO.println("Restwert: " + result);

  IO.println("numberA: " + numberA);
  numberA++; // --> numberA = numberA + 1;
  IO.println("numberA: " + numberA);

  result = ++numberA + numberB;
  IO.println("Result: " + result + " -  " + numberA + " - " + numberB);

  numberA = 1;
  result = numberA++ + numberA;
  IO.println("Result: " + result + " - " + numberA);


  // relational Operators
  numberA = 10;
  numberB = 20;

  IO.println("numberA ungleich numberB? " + (numberA != numberB));
  IO.println("numberA gleich numberB? " + (numberA == numberB));
  IO.println("numberA größer numberB? " + (numberA > numberB));

  numberA = numberB;
  IO.println("numberA ungleich numberB: " + (numberA != numberB));
  IO.println("numberA gleich numberB: " + (numberA == numberB));

  // logical operators

  boolean isRaining = true;
  boolean mustLeaveHouse = false;

  IO.println("Brauche ich einen Regenschirm? " + (mustLeaveHouse && isRaining));

  // mit Fragezeichen Operator
  IO.println("Brauche ich einen Regenschirm? " + ((mustLeaveHouse && isRaining) ? "Ja, Schirm einpacken" : "Nein, Sonnencreme mitnehmen"));


  String myText = null;

  if(myText != null && myText.length() > 5){
    IO.println("Langer String: " + myText);
  }



  numberA += numberB; // ==> numberA = numberA + numberB;
  numberA -= numberB; // ==> numberA = numberA - numberB;
  numberA *= numberB; // ==> numberA = numberA * numberB;



  // Fragezeichen Operator
  // Wahrheitswert ? Option1 : Option2

  isRaining = false;
  String rainText = isRaining ? "Schirm" : "kein Schirm";
  System.out.println(rainText);

  System.out.println((rainText.length() > 7) ? "langer Text" : "kurzer Text");


  // String Verkettung

  numberA = 42;
  numberB = 100;
  char mySign = '!';

  myText = "Hallo" + " " + "Kurs!";
  myText = mySign + numberB + numberA + myText + " " + rainText + (numberB + numberA) + numberA + mySign;
  IO.println(myText);

}