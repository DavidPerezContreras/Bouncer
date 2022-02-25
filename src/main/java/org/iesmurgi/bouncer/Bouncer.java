package org.iesmurgi.bouncer;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Bouncer extends ImageView implements Runnable{
    int i=0;
    @Override
    public void run() {
        Arbitro arbitro = new Arbitro(this);
        while (true){
            System.out.println(i);
            //movimiento////////////////////////


            this.syncSetX(i+=1);







            ////////////////////////////////////////

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    class Arbitro{
        private final Bouncer bouncer;
        Arbitro(Bouncer bouncer){
            this.bouncer=bouncer;
        }
    }

    public Bouncer(File imageFile,double width,double height) throws FileNotFoundException {
        super(new Image(new FileInputStream(imageFile),150d,150d,false,true));
    }

    public Bouncer() throws IOException {
        super(new Image(new URL("https://upload.wikimedia.org/wikipedia/commons/9/9a/Gull_portrait_ca_usa.jpg").openStream(),150d,150d,false,true));
        //System.out.println(new File("src\\org\\iesmurgi\\bouncer\\myImage.png").getAbsolutePath());

    }

    enum Rumbo{
        NE,SE,SW,NW
    }

    public synchronized double syncGetX(){
        return this.getLayoutX();
    }
    public synchronized double syncGetY(){
        return this.getLayoutY();
    }

    public synchronized void syncSetX(double x){
        this.setLayoutX(x);
    }
    public synchronized void syncSetY(double y){
        this.setLayoutY(y);
    }


}
