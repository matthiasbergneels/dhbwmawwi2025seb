
void main(){

  // Simple Data Types
  int numberA = 10;
  int numberB;

  // Call by Value
  numberB = numberA;

  IO.println("numberA: " + numberA);
  IO.println("numberB: " + numberB);

  numberA = 42;

  IO.println("numberA: " + numberA);
  IO.println("numberB: " + numberB);

  // Reference Datatypes
  String[] goodTeacher = {"Der", "Dozent", "ist", "super"};
  String[] badTeacher;

  // Call by Reference
  badTeacher = goodTeacher;

  IO.println("goodTeacher: ");
  for(String word : goodTeacher){
    IO.print(word + " ");
  }
  IO.println();
  IO.println("badTeacher: ");
  for(String word : badTeacher){
    IO.print(word + " ");
  }

  badTeacher[3] = "scheiße";

  IO.println();
  IO.println("goodTeacher: ");
  for(String word : goodTeacher){
    IO.print(word + " ");
  }
  IO.println();
  IO.println("badTeacher: ");
  for(String word : badTeacher){
    IO.print(word + " ");
  }


  goodTeacher[3] = "super";

  // clone array
  badTeacher = goodTeacher.clone();

  badTeacher[3] = "scheiße";

  IO.println();
  IO.println("goodTeacher: ");
  for(String word : goodTeacher){
    IO.print(word + " ");
  }
  IO.println();
  IO.println("badTeacher: ");
  for(String word : badTeacher){
    IO.print(word + " ");
  }
  IO.println();


  // String - false friend

  numberA = 10;
  numberB = 10;

  IO.println("numberA == numberB: " + (numberA == numberB));

  String firstString = "Hallo";
  String secondString = "Hallo";
  String thirdString = "Klaus";
  String fourthString = new String("Hallo");
  String partOne = "Hal";
  String partTwo = "lo";
  String fifthString = partOne + partTwo;

  IO.println("firstString: " + firstString);
  IO.println("secondString: " + secondString);
  IO.println("thirdString: " + thirdString);
  IO.println("fourthString: " + fourthString);
  IO.println("fifthString: " + fifthString);

  IO.println("firstString == secondString: " + (firstString == secondString));
  IO.println("firstString == thirdString: " + (firstString == thirdString));
  IO.println("firstString == fourthString: " + (firstString == fourthString));
  IO.println("firstString == fifthString: " + (firstString == fifthString));

  IO.println("firstString.equals(secondString): " + (firstString.equals(secondString)));
  IO.println("firstString.equals(thirdString): " + (firstString.equals(thirdString)));
  IO.println("firstString.equals(fourthString): " + (firstString.equals(fourthString)));
  IO.println("firstString.equals(fifthString): " + (firstString.equals(fifthString)));

}