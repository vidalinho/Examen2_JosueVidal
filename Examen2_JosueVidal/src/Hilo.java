
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josue
 */
public class Hilo extends Thread {

    private JLabel label;
    private int tiempo;
    private JProgressBar progbar;

    public Hilo(JLabel label, int tiempo, JProgressBar progbar) {
        this.label = label;
        this.tiempo = tiempo;
        this.progbar = progbar;
    }
    
    

    @Override
    public void run() {
        int c = 0;

        while (true || c < tiempo) {
            c++;
            progbar.setValue(progbar.getValue() + 1);
            label.setText(Integer.toString(c));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
