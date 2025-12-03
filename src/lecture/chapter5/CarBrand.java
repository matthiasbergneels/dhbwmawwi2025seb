package lecture.chapter5;

public enum CarBrand {
  MERCEDES("$$$"),
  BMW("$$$"),
  KIA("$"),
  FIAT("$"),
  OPEL("$"),
  PORSCHÉ("$$$$"),
  VOLKSWAGEN("$$");

  private String priceClass;

  CarBrand(String priceClass){
    this.priceClass = priceClass;
  }

  public String getPriceClass() {
    return priceClass;
  }

  @Override
  public String toString() {
    return switch(this){
      case MERCEDES -> "Mercedes";
      case BMW -> "BMW";
      case KIA -> "KIA";
      case FIAT -> "Fiat";
      case OPEL -> "OPEL";
      case PORSCHÉ ->  "Porschéééé";
      case VOLKSWAGEN -> "Volkswagen";
    };
  }

}
