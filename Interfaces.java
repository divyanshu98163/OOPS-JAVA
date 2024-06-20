public class Interfaces {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.Moves();
    }
}

interface ChessPlyar{
    void Moves();
}

class Queen implements ChessPlyar{
    public void Moves(){    
        System.out.println("up,down,left,Right,digonal (all 4 dirns)");
    }
}

class Rook implements ChessPlyar{
    public void Moves(){
        System.out.println("Up ,down ,left , right ");
    }
}