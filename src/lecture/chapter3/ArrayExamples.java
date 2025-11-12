void main(){

  int numberA = 10, numberB = 15, numberC = 13; //...

  int[] numbers = new int[10];
  numbers[0] = 10;
  numbers[1] = 20;
  numbers[2] = 30;
  numbers[3] = 40;
  numbers[4] = numberB;
  //..
  numbers[9] = 60;

  IO.println("Anzahl Elemente: " + numbers.length);

  IO.println(numbers[3]);

  String[] words = {"Hallo", "toll", "Fisch", "Mütze", "Klaus"};
  IO.println(words[3]);


  char[][] ticTacToe = new char[3][3];
  ticTacToe[1][1] = 'X';
  ticTacToe[0][2] = 'O';

  IO.println(ticTacToe[1][1]);
  IO.println(ticTacToe[0][2]);
  IO.println(ticTacToe[0][0]);

  // Book --> 1. dimension chapters, 2. dimension sentences, 3. dimesnion words
  String[][][] book = new String[5][][];

  // 1. chapter
  book[0] = new String[5][];

  // 1. chapter, 1. sentence
  book[0][0] =  new String[5];

  book[0][0][0] = "Dieses";
  book[0][0][1] = "Buch";
  book[0][0][2] = "wird";
  book[0][0][3] = "super";
  book[0][0][4] = "toll";

  // 1. chapter, 2. sentence
  book[0][1] =  new String[3];

  book[0][0][0] = "Glauben";
  book[0][0][1] = "sie";
  book[0][0][2] = "mir";

  IO.println(book[0][0][3]);

  IO.println("Anzahl Kapitel: " + book.length);
  IO.println("Anzahl Sätze im ersten Kapitel: " + book[0].length);
  IO.println("Anzahl Wörter im ersten Sätze im ersten Kapitel: " + book[0][0].length);



  String[][][] secondeBook = {{{"Hallo", "das", "wird", "ein", "tolles", "Buch"},{"wirklich", "!"},{"Hallo", "das", "wird", "ein", "tolles", "Buch"}},{{"Hallo", "das", "wird", "ein", "tolles", "Buch"},{"Hallo", "das", "wird", "ein", "tolles", "Buch"}}};

}
