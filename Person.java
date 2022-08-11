class Person {
    private String personName;
    private int companyId;
  
    Person(String personName, int companyId) {
      this.personName = personName;
      this.companyId = companyId;
    }
  
    public void printData() {
      System.out.println("名前は" + this.personName + "です");
      System.out.println("社員番号は" + this.companyId + "です");
    }
  
    public void join(Club club) {
      club.setOwner(this);
    }
    
  }
  