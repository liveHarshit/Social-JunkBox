import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class junkboxGUI extends java.awt.Frame {

    public junkboxGUI() {
        initComponents();
    }

    private void initComponents() {

        label1 = new java.awt.Label();
        messageET = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        label2 = new java.awt.Label();
        countET = new java.awt.Label();
        label = new java.awt.Label();
        label3 = new java.awt.Label();
        mpsET = new java.awt.TextField();
        label4 = new java.awt.Label();

        setBackground(new java.awt.Color(210, 210, 210));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(100, 100, 100));
        label1.setFont(new java.awt.Font("Dialog", 0, 24));
        label1.setForeground(new java.awt.Color(230, 230, 230));
        label1.setText("Social Junkbox");

        messageET.setBackground(new java.awt.Color(230, 230, 230));
        messageET.setFont(new java.awt.Font("Dialog", 0, 16));
        messageET.setForeground(new java.awt.Color(40, 40, 40));
        messageET.setText("Annoyance goes here...");

        button1.setBackground(new java.awt.Color(120, 120, 120));
        button1.setFont(new java.awt.Font("Dialog", 0, 18));
        button1.setForeground(new java.awt.Color(250, 250, 250));
        button1.setLabel("Select Target's Inbox");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(90, 90, 90));
        button2.setEnabled(false);
        button2.setFont(new java.awt.Font("Dialog", 0, 18));
        button2.setForeground(new java.awt.Color(250, 250, 250));
        button2.setLabel("Screw the Target");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 1, 14));
        label2.setForeground(new java.awt.Color(40, 40, 40));
        label2.setText("Sent Junk Count");

        countET.setFont(new java.awt.Font("Dialog", 1, 18));
        countET.setForeground(new java.awt.Color(40, 40, 40));
        countET.setText("0");

        label.setBackground(new java.awt.Color(190, 190, 190));
        label.setForeground(new java.awt.Color(40, 40, 40));
        label.setFont(new java.awt.Font("Dialog", 0, 14));
        label.setText("Where to puke out FRUSTATION!!");

        label3.setFont(new java.awt.Font("Dialog", 1, 14));
        label3.setForeground(new java.awt.Color(40, 40, 40));
        label3.setText("Junk / sec");

        mpsET.setBackground(new java.awt.Color(230, 230, 230));
        mpsET.setFont(new java.awt.Font("Dialog", 1, 18));
        mpsET.setForeground(new java.awt.Color(40, 40, 40));
        mpsET.setText("5");

        label4.setAlignment(java.awt.Label.RIGHT);
        label4.setFont(new java.awt.Font("Dialog", 1, 18));
        label4.setForeground(new java.awt.Color(30, 30, 30));
        label4.setText("Credit goes to Mighty Decoders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(messageET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mpsET, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageET, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mpsET, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    
    private void exitForm(java.awt.event.WindowEvent evt) {
        System.exit(0);
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
        button1.setLabel("Waiting...");
        button1.addFocusListener(focusListerner);
    }

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        if (!isRunning) {
            isRunning = true;
            start();
            button2.setLabel("Alright Stop!!");
            button2.setBackground(new java.awt.Color(150, 150, 150));
        } 
        else {
            isRunning = false;
            stop();
            button2.setLabel("Continue!!");
            button2.setBackground(new java.awt.Color(90, 90, 90));
        }
    }

    FocusListener focusListerner = new java.awt.event.FocusListener() {
		
        public void focusGained(FocusEvent e) {
        }

        public void focusLost(FocusEvent e) {
            PointerInfo pi = MouseInfo.getPointerInfo();
            Point p = pi.getLocation();
            System.out.println("X is " + p.x);
            System.out.println("Y is " + p.y);
            x = p.x;
            y = p.y;
            button1.setLabel("Try Again");
            label.setText("Successfully Clicked. Ready to fill Junk...");
            label.setBackground(new java.awt.Color(170, 170, 170));
            button2.setEnabled(true);
            button1.removeFocusListener(focusListerner);
        }
    };

    boolean isRunning = false;
    int x, y;
    String message;
    int count;
    int mps, delay;

    Robot robot;

    private void stop() {
    }

    private void start() {
        message = messageET.getText();
        String mspStr= mpsET.getText();
        try {
            mps= Integer.parseInt(mspStr);
            delay= 1000/mps;
        }
        catch(Exception e) {
            label.setText("Please Enter Message / sec Correctly.");
            return;
        }

        try {
            robot = new Robot();
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);

            junk box = new junk();
            box.start();
        } 
        catch (AWTException ex) {
        }
    }

    public class junk extends Thread {

        public void run() {
            while (isRunning) {

                message = message.toLowerCase();

                for (int i = 0; i < message.length(); i++) {
                    robot.keyPress(getKeyCode(message.charAt(i)));
                }

                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                try { 
                	Thread.sleep(delay);
                } 
                catch (Exception e) {
                }
                
                count++;
                countET.setText(count+"");
            }
        }
    }

    private int getKeyCode(char alpha) {
    	
        switch (alpha) {
        
            case 'a':
                return KeyEvent.VK_A;
            case 'b':
                return KeyEvent.VK_B;
            case 'c':
                return KeyEvent.VK_C;
            case 'd':
                return KeyEvent.VK_D;
            case 'e':
                return KeyEvent.VK_E;
            case 'f':
                return KeyEvent.VK_F;
            case 'g':
                return KeyEvent.VK_G;
            case 'h':
                return KeyEvent.VK_H;
            case 'i':
                return KeyEvent.VK_I;
            case 'j':
                return KeyEvent.VK_J;
            case 'k':
                return KeyEvent.VK_K;
            case 'l':
                return KeyEvent.VK_L;
            case 'm':
                return KeyEvent.VK_M;
            case 'n':
                return KeyEvent.VK_N;
            case 'o':
                return KeyEvent.VK_O;
            case 'p':
                return KeyEvent.VK_P;
            case 'q':
                return KeyEvent.VK_Q;
            case 'r':
                return KeyEvent.VK_R;
            case 's':
                return KeyEvent.VK_S;
            case 't':
                return KeyEvent.VK_T;
            case 'u':
                return KeyEvent.VK_U;
            case 'v':
                return KeyEvent.VK_V;
            case 'w':
                return KeyEvent.VK_W;
            case 'x':
                return KeyEvent.VK_X;
            case 'y':
                return KeyEvent.VK_Y;
            case 'z':
                return KeyEvent.VK_Z;
            case '1':
                return KeyEvent.VK_1;
            case '2':
                return KeyEvent.VK_2;
            case '3':
                return KeyEvent.VK_3;
            case '4':
                return KeyEvent.VK_4;
            case '5':
                return KeyEvent.VK_5;
            case '6':
                return KeyEvent.VK_6;
            case '7':
                return KeyEvent.VK_7;
            case '8':
                return KeyEvent.VK_8;
            case '9':
                return KeyEvent.VK_9;
            case '0':
                return KeyEvent.VK_0;
            case ',':
                return KeyEvent.VK_COMMA;
            case ' ':
                return KeyEvent.VK_SPACE;
        }
        
        return KeyEvent.VK_SPACE;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new junkboxGUI().setVisible(true);
            }
        });
    }

    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Label countET;
    private java.awt.Label label;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField messageET;
    private java.awt.TextField mpsET;
}