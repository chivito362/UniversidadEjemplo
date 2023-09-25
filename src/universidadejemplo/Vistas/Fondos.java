package universidadejemplo.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;


public class Fondos extends JDesktopPane{
    
    public Fondos() {
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        ImageIcon imagenFondo=new ImageIcon(getClass().getResource("/Imagenes/fondo-azul-degradado_23-2149346090.jpg"));
        Image imagen=imagenFondo.getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        
    }   
}
