import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class idk extends JFrame{
  
    private static final long serialVersionUID = -644285521678029486L;

    public idk() {

       panel panel;
        panel = new panel();
        this.setTitle("aix aigol");
        this.setBackground(Color.CYAN);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(600,640);
        this.setVisible(true);
     }

     public static void main(String [] args){
      System.out.println("5555");
        new idk();
         
     }

     public class panel extends JPanel implements MouseListener{
     
      private static final long serialVersionUID = 223847672235220137L;

      int rows = 3;
      int cols = 3;
      int turn = 2;
     public int curretX;
     public int curretY;
     public int stringX = 100;
     public int stringY = 100;
    
 
      public String [] [] board = new String [rows][cols];{
    board [0] [0] = "";
    board [0] [1] = "";  
    board [0] [2] = "";  
    board [1] [0] = "";  
    board [1] [1] = "";  
    board [1] [2] = "";     
    board [2] [0] = "";  
    board [2] [1] = "";  
    board [2] [2] = "";  
    }
public void paint(Graphics g) {
   int x =200;
   int i = 0;
   int a = 100;
   addMouseListener(this);
   Graphics2D g2 = (Graphics2D)g;
      for(int row=0; row<board.length; row++){
      for(int col=0; col<board[row].length; col++){
      
         g2.setColor(Color.black);
         g2.drawString(board[0][i], a, 100);
            g2.drawLine(x, 600, x, 0);
            g2.drawLine(600, x, 0, x);
          
   }
   i++;
   a = a+200;
   stringX = stringX + 200;
   stringY = stringY + 200;
   x = x+200;
}
}

@Override
public void mouseClicked(MouseEvent e) {

curretX = e.getX();
curretY = e.getY();

System.out.println(curretX);
System.out.println(curretY);
int cellSize = 200;
int clickedRow = curretY/cellSize;
int clickedCol = curretX/cellSize;
System.out.println(clickedRow);
System.out.println(clickedCol);

if( turn %2 ==0){

if (clickedRow == 0 && clickedCol == 0){
   board [0] [0] = "x";
   repaint();
turn++;
}
if (clickedRow == 0 && clickedCol == 1){
   board [0] [1] = "x";
   repaint();
   turn++;
}
if (clickedRow == 0 && clickedCol == 2){
   board [0] [2] = "x";
   repaint();
   turn++;
}

}
if(turn %2 !=0){
   if (clickedRow ==0 && clickedCol ==1){
      board [0] [1] = "O";
      repaint();
      turn++;

   }
}




}


@Override
public void mousePressed(MouseEvent e) {

}

@Override
public void mouseReleased(MouseEvent e) {

}

@Override
public void mouseEntered(MouseEvent e) {

}

@Override
public void mouseExited(MouseEvent e) {

}
}

}

