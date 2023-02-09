import java.util.EnumSet;

public class belajartodo {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner (System.in);
    
    public static void main(String[] args) {

        viewShowTodoList();
        
    }
      // menampilkan todo list
      public static void showTodoList(){
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }

    }

    public static void testShowTodoList (){
        model[0] = "belajar";
        model[1] = "Menampilan todo list test lur";
        showTodoList();

    }
    

    // menginput todo list
    public static void addTodoList(String todo) {
        // cek modul penuh?
        var full = true;
        for (int i = 0; i < model.length; i++) {
            if(model(i) == null){
                // model masih ada yang kosong
                full = false;
                break;
            }
        }
        // jika penuh , resize ukuran aray jadi 2x
        if (full){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i <temp.length; i++){
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi aray yang null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }

    }

    private static Object model(int i) {
        return null;
    }


    //menghapus todo list
    public static Boolean removeTodoList(Integer number){
        if ((number -1 ) >= model.length) {
            return false;
        }else if (model[number-1] == null) {
            return false;
        }else{
            for (int i = (number -1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                model [i] = null;
                }
                else{
                    model[i] = model [i + 1];
                } 
            }
            return true;
        } 

    }

    public static void testRemoveTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        boolean data = removeTodoList(20);
        System.out.println(data);

        data = removeTodoList(7);
        System.out.println(data);

        data = removeTodoList(2 );
        System.out.println(data);
        
        showTodoList();

    }

    public static String input (String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data ;

    }

    // tampilan todo list
    public static void viewShowTodoList(){
       while (true){
        System.out.println(" TODOLIST ");
        showTodoList();
        
        System.out.println("MENU");
        System.out.println("1. TAMBAH");
        System.out.println("2. HAPUS");
        System.out.println("x. KELUAR");

        var input = input ("PILIH");

        if (input.equals("1")) {
            viewAddTodoList();
        }else if (input.equals("2")) {
            viewRemoveTodoList();
        }else if (input.equals("x")){
            break;
        }else {
            System.out.println("pilihan tidak di mengerti");
        }

       }
    }

    public static void testViewShowTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        viewShowTodoList();
    } 
    // tampilan view Add Todo List
    public static void viewAddTodoList(){
        System.out.println("TAMBAHKAN TODO");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")){

        }else {
            addTodoList(todo);
        }


    }

    public static void testAddShowTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");

        viewAddTodoList();
        showTodoList();
    }
    // tampilan view Remove Todo List
    public static void viewRemoveTodoList(){
        System.out.println(" MENGHAPUS TODOLIST ");

        var number = input("NOMOR YANG DI HAPUS ( x JIKA BATAL) ");
        
        if (number.equals("x")){
            //batall
        } else {
            boolean sukses = removeTodoList(Integer.valueOf(number));
            if (!sukses){
                System.out.println("GAGAL MENGHAPUS TODOLIST " + number);
            }
        }

    }

    public static void testViewRemoveTodoList () {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        showTodoList();
        viewRemoveTodoList();
        showTodoList();
    }

    
}


