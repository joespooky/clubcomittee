public class Controller {

    private DataSet ds;
    private DTO dto;

    Controller() {
        dto = new DTO();
        ds = dto.load(); // fileがないときはnewで普通につくる
    }

    void start_cli() {
        Scanner in = new Scanner(System.in); 
        boolean is_end = false;

        while(is_end) {
            System.out.println(">>>");
            String s = in.nextLine(); //C:\\testing.txt
    
            switch(s) {
                case "add":
                    this.add();
                    break;
    
                case "list":
                    this.list();
                    break;
    
                case "exit":
                    this.end();
                    is_end = true;
                    break;
    
                default:
                    this.error();
                    break;
            }
        }
    }

    void add() {
/*
      1) register a persion to a Club
       input ID
       input Name
         ->  create a instance of Persion
       input a club to be belonged (id)
        -> search club instance from collection
       add a person to the club
 
 */
    Scanner in = new Scanner(System.in); 
    System.out.println("input ID");
    String s = in.nextLine();
    int id = Integer.parseInt(s);
    System.out.println("input name");
    String name = in.nextLine();
    Persion p = new Person();
    p.id = id;
    p.name = name;
    ds.pl.add(p); // add person to a list in  dataset

    System.out.println("input club id");
    String s = in.nextLine();
    int cid = Integer.parseInt(s);
    for(Club c : ds.cl) {
        if(c.getID() == cid) {
            c.add(p);  // add persion to a club
            break;
        }
    }
    
    }

    void list() {
/*
 * 
    2) list persons in a club
       input a club to be listed (id)
       show a list 
 */
    System.out.println("input club id");
    String s = in.nextLine();
    int cid = Integer.parseInt(s);
    for(Club c : ds.cl) {
        if(c.getID() == cid) {
            c.list();
            break;
        }
    }


    }

    void end() {
        /* save instances
         */
        dto.save(ds);
    }
        

    void error() {
        System.out.println("invalid arguments");
    }
                
}



    -------- (controller)
    0) parse commands
    
     
    ----------


}