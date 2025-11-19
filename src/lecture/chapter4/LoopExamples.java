void main(){


  int count = 0;

  IO.println("While-Schleife: ");
  while(count < 10)
    IO.print(count + ((count++ == 9)  ? "" : " - "));

  IO.println();

  IO.println("While-Schleife 2: ");
  count = 0;
  while(count < 10) {
    IO.print(count);
    if(count != 9){
      IO.print(" - ");
    }
    count++;
  }


  IO.println();

  IO.println("Do-While-Schleife: ");
  count = 0;
  do{
    IO.print(count);
    if(count != 9){
      IO.print(" - ");
    }
    count++;
  }while(count < 10);

  IO.println();

  IO.println("For-Schleife: ");
  for(int i = 0; i < 10; i++){
    IO.print(i);
    if(i != 9){
      IO.print(" - ");
    }
  }

  IO.println();
  String[] words = {"Hallo", "das", "ist", "ein", "Testarray"};

  IO.println("Array Zugriff mit For-Schleife:");
  for(int i = 0; i < words.length; i++){
    if(words[i].equals("ein")){
      IO.println("Ein - gefunden: Schleife abgebrochen");
      break;
    }
    IO.println(words[i]);
  }


  IO.println("Array Zugriff mit For-Each-Schleife:");
  for(String word : words){

    if(word.equals("ist")){
      IO.println("Wort übersprungen");
      continue;
    }

    IO.println(word);
  }

  IO.println("Timmmmmmmmmmmay For-Schleife:");
  count = 0;
  for(;;){
    IO.println("timmmmmmmmmay - " + count++);
    if(count > 9){
      break;
    }
  }

}