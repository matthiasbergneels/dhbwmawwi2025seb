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

  String myText = null;

  if(myText != null && myText.length() > 5){
    IO.println("Langer String: " + myText);
  }



  numberA += numberB; // ==> numberA = numberA + numberB;
  numberA -= numberB; // ==> numberA = numberA - numberB;
  numberA *= numberB; // ==> numberA = numberA * numberB;



}