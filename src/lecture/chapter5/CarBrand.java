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

}
