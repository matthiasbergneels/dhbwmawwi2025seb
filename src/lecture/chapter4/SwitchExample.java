void main(){

  int grade = 4;

  switch(grade){
    case 1:
      IO.println("Sehr gut!");
      break;
    case 2:
      IO.println("Gut!");
      break;
    case 3:
      IO.println("Befriedigend!");
      IO.println("Gerade so bestanden");
      break;
    case 4:
      IO.println("Ausreichend!");
      break;
    case 5:
      IO.println("Ungenügend!");
      break;
    default:
      IO.println("Ungültige Note");
  }

  switch(grade){
    case 1:
    case 2:
    case 3:
    case 4:
      IO.println("Bestanden");
      break;
    case 5:
      IO.println("Durchgefallen!");
      break;
    default:
      IO.println("Ungültige Note");
  }

  switch(grade){
    case 1 -> IO.println("Sehr gut");
    case 2 -> IO.println("Gut");
    case 3 -> IO.println("Befriedigend");
    case 4 -> IO.println("Ausreichend");
    case 5 -> IO.println("Ungenügend!");
  }

  switch(grade){
    case 1, 2, 3, 4 -> IO.println("Bestanden!");
    case 5 -> IO.println("Durchgefallen!");
  }

  String gradeEvaluation = switch(grade){
    case 1, 2, 3, 4 -> "Bestanden!";
    case 5 -> "Durchgefallen!";
    default -> "Ungültige Note";
  };

  String day = "MONDAY";
  int numLetters = switch (day) {
    case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
    case "TUESDAY" -> 7;
    default -> {
      int result = day.length();
      yield result;
    }
  };




}