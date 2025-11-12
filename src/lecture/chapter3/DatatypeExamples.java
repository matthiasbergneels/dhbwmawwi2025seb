package lecture.chapter3;

public class DatatypeExamples {

  public static void main(String[] args) {

    // Declaration of int variable
    int numberA;

    // initialisation of int variable
    numberA = 123;

    long numberB = 1304;

    int numberC, numberD = 10, numberE;

    String firstName; // lowerCamelCase

    numberC = 100;
    System.out.println(numberC);


    // usage of constants
    final double VALUE_OF_PI = 3.14159;

    // PI = 5;

    final double VALUE_OF_E;
    VALUE_OF_E = 2.7;


    // integer literals

    int literalExampleA = 11;          // decimal literal --> 11 -> 11
    System.out.println(literalExampleA);

    literalExampleA = 011;          // octal literal --> 011 -> 9
    System.out.println(literalExampleA);

    literalExampleA = 0b11;             // binary literal --> 0b11 -> 3
    System.out.println(literalExampleA);

    literalExampleA = 0x11;             // binary literal --> 0x11 -> 17
    System.out.println(literalExampleA);

    final int RGB_RED = 0xFF0000;

    long extremLongNumber = 3_000_000_000L;


    // float / double literal
    double literalExampleB = 5.0;
    System.out.println(literalExampleB);

    literalExampleB = .567;
    System.out.println(literalExampleB);
    literalExampleB = 11.;
    System.out.println(literalExampleB);
    literalExampleB = 0.5e3;
    System.out.println(literalExampleB);
    literalExampleB = -0.5e-2;
    System.out.println(literalExampleB);
    literalExampleB = .567D;
    System.out.println(literalExampleB);

    float literalExampleC = 0.5F;
    System.out.println(literalExampleC);


    // boolean literal
    boolean isRaining = false; // true

    // char literal

    char literalExampleD = 'A';
    System.out.println(literalExampleD);
    literalExampleD = '\'';
    System.out.println(literalExampleD);
    literalExampleD = '\u2764';
    System.out.println(literalExampleD);


    // String literal
    String literalTextExample = "Hier steht \nein \\\"toller\" Text \u2764 ";
    System.out.println(literalTextExample);

    String htmlCode = "<html>\n" +
                      "\t<head></head>\n" +
                      "\t<body>\n" +
                        "\t\t<h1>Tolle Webseite</h1>\n" +
                      "\t</body>\n" +
                      "</html>";

    System.out.println(htmlCode);

    String htmlCodeTextBlock = """
      <html>
        <head><head>
        <body>
          <h1>Tolle "Webseite"</h1>
          <p>'h' "toll" \u2764</p>
        </body>
      </html>
      """;

    System.out.println(htmlCodeTextBlock);


  }
}
