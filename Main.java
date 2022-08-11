import java.util.Scanner;

class Main {
    // 各種クラブのインスタンスを作る
    static Culturalclub flowerclub = new Culturalclub("茶道部", 2005);
    static Athleticclub rugbyclub = new Athleticclub("ラグビー部", 1999);

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("登録「１」ないし全体抽出「２」の番号を入れてください：");
      int selecedOperation = scanner.nextInt();     
      if (selecedOperation == 1) {
    // 登録の場合 
        System.out.print("あなたの社員番号を入れてください：");
        int companyId = scanner.nextInt();
        //   String person = "person" + companyId;＞＞＞＞不明点
        System.out.print("あなたの名前を入れてください：");
        String newRegistedName = scanner.next();
        Person person2 = new Person(newRegistedName, companyId);
        // >>>不明点
        scanner.close();
    //どのクラブに参加しますか        
        person2.join(rugbyclub);
        person2.printData();
      } else {

        System.out.println("【文化系クラブの情報】");
        flowerclub.printData();
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");   
        // System.out.println("【登録者の情報】");
        // culturalclub.getOwner().printData(); 

        System.out.println("=================");
        System.out.println("【体育会系クラブの情報】");
        rugbyclub.printData();
        System.out.println("-----------------");
        // System.out.println("【登録者の情報】");
        // athleticclub.getOwner().printData();
      }
    }
  }
  