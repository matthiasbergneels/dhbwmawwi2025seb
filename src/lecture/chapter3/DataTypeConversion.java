
void main(){

  double numberA = 256.6;
  int numberB = 10;

  // int to double conversion
  numberA = numberB;
  IO.println(numberA);
  IO.println(numberB);

  numberA = 5.6;
  numberB = (int)numberA;
  IO.println(numberA);
  IO.println(numberB);

  byte numberC;

  numberB = 257;
  numberC = (byte)numberB;
  IO.println(numberB);
  IO.println(numberC);

  numberA = 128.6;
  numberC = (byte)numberA;
  IO.println(numberA);
  IO.println(numberC);


  numberB = (int)Math.round(numberA);
  IO.println(numberA);
  IO.println(numberB);



}
