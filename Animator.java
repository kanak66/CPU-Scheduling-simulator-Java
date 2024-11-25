
package Main;

import javax.swing.JButton;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Animator extends Thread {

    JButton btn;
    public boolean allJobsDone = false;
    
    public Animator() {
    }

    public Animator(JButton btn) {
        this.btn = btn;
    }

    public void setAllJobsDone(boolean allJobsDone) {
        this.allJobsDone = allJobsDone;
    }
    
    

    @Override
    public void run(){
        try {

            while (!allJobsDone) {
                btn.doClick();
                Thread.sleep(500);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Animator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
