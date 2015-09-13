
package Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author Juan Camilo
 */
public class Ventana extends JFrame {
JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bigual, bDEL, bCE, bpunto, bpa, bpc, bp, bm, bd, bs, br;
JTextField Resultado;
JPanel Panel;
ImageIcon logos = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
ImageIcon logo = new ImageIcon(getClass().getResource("/Imagenes/images.jpg"));
JLabel m1;
//ssss



    public Ventana() throws HeadlessException {
        super("Calculadora");
        int resultado = 325;
        int x = resultado/5;//65
        int y = 65; //75-81.25
        int a = resultado/(resultado/50);
        int l = a;
        int i = 125;
        Container contenedor = getContentPane();
        
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bigual = new JButton("=");
        bDEL = new JButton("DEL");
        bCE = new JButton("AC");
        bpunto = new JButton(".");
        bpa = new JButton("(");
        bpc = new JButton(")");
        bp = new JButton("^");
        bm = new JButton("*");
        bd = new JButton("/");
        bs = new JButton("+");
        br = new JButton("-");
        Resultado = new JTextField();
        Panel = new JPanel();
        setContentPane(Panel);
        Panel.setLayout(null);
        Panel.setBackground(Color.yellow);
        Panel.setLayout(null);
        Panel.add(Resultado);
//        m1.setBounds(20, 20, 20, 20);
//        m1.setText("Calculadora");
//        Panel.add(m1);
        Resultado.setBounds(65,75,resultado,35);
        Panel.add(b7);
        b7.setBounds(x,i,a,l);
        Panel.add(b8);
        b8.setBounds(x*2,i,a,l);
        Panel.add(b9);
        b9.setBounds(x*3,i,a,l);
        Panel.add(bDEL);
        bDEL.setBounds(x*4, i, 56, l);
        Panel.add(bCE);
        bCE.setBounds((x*5)+5,i, 56, l);
        Panel.add(b4);
        b4.setBounds(x,y*3,a,l);
        Panel.add(b5);
        b5.setBounds(x*2,y*3,a,l);
        Panel.add(b6);
        b6.setBounds(x*3,y*3,a,l);
        Panel.add(bpa);
        bpa.setBounds(x*4,y*3,a,l);
        Panel.add(bpc);
        bpc.setBounds(x*5,y*3,a,l);
        Panel.add(b1);
        b1.setBounds(x*1,y*4,a,l);
        Panel.add(b2);
        b2.setBounds(x*2,y*4,a,l);
        Panel.add(b3);
        b3.setBounds(x*3,y*4,a,l);
        Panel.add(bm);
        bm.setBounds(x*4,y*4,a,l);
        Panel.add(bd);
        bd.setBounds(x*5,y*4,a,l);
        Panel.add(b0);
        b0.setBounds(x*1,y*5,a,l);
        Panel.add(bpunto);
        bpunto.setBounds(x*2,y*5,a,l);
        Panel.add(bs);
        bs.setBounds(x*4,y*5,a,l);
        Panel.add(br);
        br.setBounds(x*5,y*5,a,l);
        Panel.add(bigual);
        bigual.setBounds(x*3,y*5,a,l);
        
        setSize(470, 595); //492 , 595
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
    }
    
    public static void main(String[] args) {
        Ventana app = new Ventana();
     }
    
    
}
