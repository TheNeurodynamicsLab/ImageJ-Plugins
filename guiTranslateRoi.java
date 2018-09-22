/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NDL_Plugins;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.SwingConstants;

/**
 *
 * @author Balaji
 */
public class guiTranslateRoi extends javax.swing.JFrame {

    /**
     * Creates new form guiTranslateGui
     */
    public guiTranslateRoi() {
        initComponents();
    }
/**
 * Use this method to listen to events of this GUI
 *
     * @param action
 */
    public void addActionListener(ActionListener action){
       
    }
    public void addItemListener(ItemListener itemEvent){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        panelMvbyPix = new javax.swing.JPanel();
        txt_yDist = new javax.swing.JTextField();
        txt_xDist = new javax.swing.JTextField();
        txt_zDist = new javax.swing.JTextField();
        xPosLabel = new javax.swing.JLabel();
        zPosLabel = new javax.swing.JLabel();
        yPosLabel = new javax.swing.JLabel();
        btnMove = new javax.swing.JButton();
        radBtn_RelativeMove = new javax.swing.JRadioButton();
        radBtn_AbsMove = new javax.swing.JRadioButton();
        panelClick2Move = new javax.swing.JPanel();
        btnNorth = new javax.swing.plaf.basic.BasicArrowButton(SwingConstants.NORTH);
        btnEast = new javax.swing.plaf.basic.BasicArrowButton(SwingConstants.EAST);
        btnWest = new javax.swing.plaf.basic.BasicArrowButton(SwingConstants.WEST);
        btnSouth = new javax.swing.plaf.basic.BasicArrowButton(SwingConstants.SOUTH);
        btnReCtrinMove = new javax.swing.JButton();
        btnZdn = new javax.swing.plaf.basic.BasicArrowButton(SwingConstants.SOUTH);
        btnZup = new javax.swing.plaf.basic.BasicArrowButton(SwingConstants.NORTH);
        stepsizeLabel = new javax.swing.JLabel();
        xStepSzLabel = new javax.swing.JLabel();
        yStepSzLabel = new javax.swing.JLabel();
        zStepSzLabel = new javax.swing.JLabel();
        txt_xStepSz = new javax.swing.JTextField();
        txt_yStepSz = new javax.swing.JTextField();
        txt_zStepSz = new javax.swing.JTextField();
        radBtnMvinSlice = new javax.swing.JRadioButton();
        radBtnMvSel3DRoi = new javax.swing.JRadioButton();
        radBtnMvAll = new javax.swing.JRadioButton();
        panCurrPos = new javax.swing.JPanel();
        yCurPosLabel = new javax.swing.JLabel();
        txt_yPos = new javax.swing.JTextField();
        txt_zPos = new javax.swing.JTextField();
        txt_xPos = new javax.swing.JTextField();
        xCurPosLabel = new javax.swing.JLabel();
        zCurPosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        labelTitle.setText("ROI Translator");

        panelMvbyPix.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Move by Pixels", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txt_yDist.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_yDist.setText("0");

        txt_xDist.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_xDist.setText("0");

        txt_zDist.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_zDist.setText("0");

        xPosLabel.setText("x Position");

        zPosLabel.setText("z Position");

        yPosLabel.setText("y Position");

        btnMove.setText("Move");

        radBtn_RelativeMove.setSelected(true);
        radBtn_RelativeMove.setText("Relative");

        radBtn_AbsMove.setText("Absolute");

        javax.swing.GroupLayout panelMvbyPixLayout = new javax.swing.GroupLayout(panelMvbyPix);
        panelMvbyPix.setLayout(panelMvbyPixLayout);
        panelMvbyPixLayout.setHorizontalGroup(
            panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMvbyPixLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtn_RelativeMove)
                    .addGroup(panelMvbyPixLayout.createSequentialGroup()
                        .addGroup(panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(xPosLabel)
                            .addComponent(zPosLabel)
                            .addComponent(yPosLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_zDist)
                            .addComponent(txt_yDist, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_xDist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnMove)
                        .addComponent(radBtn_AbsMove)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMvbyPixLayout.setVerticalGroup(
            panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMvbyPixLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_xDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xPosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_yDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yPosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMvbyPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_zDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zPosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radBtn_RelativeMove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radBtn_AbsMove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelClick2Move.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Click to Move ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnNorth.setText("");

        btnEast.setText("");

        btnWest.setText("");

        btnSouth.setText("");

        btnReCtrinMove.setText("Ctr");
        btnReCtrinMove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReCtrinMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReCtrinMoveActionPerformed(evt);
            }
        });

        btnZdn.setText("");

        btnZup.setText("");

        stepsizeLabel.setText("Step Size (Pixels):");

        xStepSzLabel.setText("x");

        yStepSzLabel.setText("y");

        zStepSzLabel.setText("z");

        txt_xStepSz.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_xStepSz.setText("10");

        txt_yStepSz.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_yStepSz.setText("10");

        txt_zStepSz.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_zStepSz.setText("10");

        radBtnMvinSlice.setSelected(true);
        radBtnMvinSlice.setText("Move all ROI(2D) in a Slice");

        radBtnMvSel3DRoi.setText("Move the selected 3D Roi");

        radBtnMvAll.setText("Move all the 3D Rois");

        javax.swing.GroupLayout panelClick2MoveLayout = new javax.swing.GroupLayout(panelClick2Move);
        panelClick2Move.setLayout(panelClick2MoveLayout);
        panelClick2MoveLayout.setHorizontalGroup(
            panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClick2MoveLayout.createSequentialGroup()
                .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClick2MoveLayout.createSequentialGroup()
                        .addComponent(stepsizeLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClick2MoveLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radBtnMvSel3DRoi)
                            .addComponent(radBtnMvinSlice)
                            .addComponent(radBtnMvAll)
                            .addGroup(panelClick2MoveLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_xStepSz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelClick2MoveLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_yStepSz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelClick2MoveLayout.createSequentialGroup()
                                                .addComponent(xStepSzLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45)
                                                .addComponent(yStepSzLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(panelClick2MoveLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnWest, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReCtrinMove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSouth, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(btnEast, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_zStepSz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(zStepSzLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnZup, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnZdn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        panelClick2MoveLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEast, btnNorth, btnReCtrinMove, btnSouth, btnWest, btnZdn, btnZup});

        panelClick2MoveLayout.setVerticalGroup(
            panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClick2MoveLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(stepsizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(xStepSzLabel)
                    .addComponent(yStepSzLabel)
                    .addComponent(zStepSzLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_zStepSz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_yStepSz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_xStepSz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClick2MoveLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNorth, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClick2MoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReCtrinMove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEast)
                            .addComponent(btnWest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSouth))
                    .addGroup(panelClick2MoveLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnZup, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZdn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radBtnMvinSlice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radBtnMvSel3DRoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radBtnMvAll)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelClick2MoveLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEast, btnNorth, btnReCtrinMove, btnSouth, btnWest, btnZdn, btnZup});

        panCurrPos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Current Position", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        yCurPosLabel.setText("y");

        txt_yPos.setEditable(false);
        txt_yPos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_yPos.setText("0");

        txt_zPos.setEditable(false);
        txt_zPos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_zPos.setText("0");
        txt_zPos.setToolTipText("");

        txt_xPos.setEditable(false);
        txt_xPos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_xPos.setText("0");

        xCurPosLabel.setText("x");

        zCurPosLabel.setText("z");

        javax.swing.GroupLayout panCurrPosLayout = new javax.swing.GroupLayout(panCurrPos);
        panCurrPos.setLayout(panCurrPosLayout);
        panCurrPosLayout.setHorizontalGroup(
            panCurrPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCurrPosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panCurrPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panCurrPosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(xCurPosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yCurPosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(zCurPosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(panCurrPosLayout.createSequentialGroup()
                        .addComponent(txt_xPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_yPos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_zPos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        panCurrPosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_xPos, txt_yPos});

        panCurrPosLayout.setVerticalGroup(
            panCurrPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCurrPosLayout.createSequentialGroup()
                .addGroup(panCurrPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xCurPosLabel)
                    .addComponent(yCurPosLabel)
                    .addComponent(zCurPosLabel))
                .addGap(5, 5, 5)
                .addGroup(panCurrPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_yPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_xPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_zPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelClick2Move, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelMvbyPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panCurrPos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panCurrPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMvbyPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelClick2Move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void btnReCtrinMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReCtrinMoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReCtrinMoveActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEast;
    private javax.swing.JButton btnMove;
    private javax.swing.JButton btnNorth;
    private javax.swing.JButton btnReCtrinMove;
    private javax.swing.JButton btnSouth;
    private javax.swing.JButton btnWest;
    private javax.swing.JButton btnZdn;
    private javax.swing.JButton btnZup;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panCurrPos;
    private javax.swing.JPanel panelClick2Move;
    private javax.swing.JPanel panelMvbyPix;
    private javax.swing.JRadioButton radBtnMvAll;
    private javax.swing.JRadioButton radBtnMvSel3DRoi;
    private javax.swing.JRadioButton radBtnMvinSlice;
    private javax.swing.JRadioButton radBtn_AbsMove;
    private javax.swing.JRadioButton radBtn_RelativeMove;
    private javax.swing.JLabel stepsizeLabel;
    private javax.swing.JTextField txt_xDist;
    private javax.swing.JTextField txt_xPos;
    private javax.swing.JTextField txt_xStepSz;
    private javax.swing.JTextField txt_yDist;
    private javax.swing.JTextField txt_yPos;
    private javax.swing.JTextField txt_yStepSz;
    private javax.swing.JTextField txt_zDist;
    private javax.swing.JTextField txt_zPos;
    private javax.swing.JTextField txt_zStepSz;
    private javax.swing.JLabel xCurPosLabel;
    private javax.swing.JLabel xPosLabel;
    private javax.swing.JLabel xStepSzLabel;
    private javax.swing.JLabel yCurPosLabel;
    private javax.swing.JLabel yPosLabel;
    private javax.swing.JLabel yStepSzLabel;
    private javax.swing.JLabel zCurPosLabel;
    private javax.swing.JLabel zPosLabel;
    private javax.swing.JLabel zStepSzLabel;
    // End of variables declaration//GEN-END:variables
}
