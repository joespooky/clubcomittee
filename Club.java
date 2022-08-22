abstract class Club {
    private String name;
    private int estYear;
    protected int memberNumber = 0;
    protected int newMember;
    private Person owner;
    private Collection<Persion> pl;ß
  
    Club(String name, int estYear) {
      this.name = name;
      this.estYear = estYear;
    }
  
    public String getName() {
      return this.name;
    }
    public int getEstYear() {
      return this.estYear;
    }
    public int getMemberNumber() {
      return this.memberNumber;
    }
    public Person getOwner() {
      return this.owner;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setEstYear(int estYear) {
      this.estYear = estYear;
    }
    public void setOwner(Person person) {
      this.owner = person;
    }
  
    public void printData() {
      System.out.println("名前：" + this.name);
      System.out.println("設立年：" + this.estYear + "年");
      System.out.println("メンバー数：" + this.memberNumber + "人");
    }
  
    void list() {
      for(Person p : pl) {
        p.print();
      }

    }

    // public abstract void add(int newMember);
  }
  