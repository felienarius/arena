/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.impaq.arena.visualisation.impl.swing;

import com.impaq.arena.player.Player;

/**
 *
 * @author jaro
 */
public class PlayerInfo extends javax.swing.JPanel {

  /**
   * Creates new form PlayerInfo
   */
  public PlayerInfo() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

    castleLabel = new javax.swing.JLabel();
    castleValue = new javax.swing.JLabel();
    wizardsLabel = new javax.swing.JLabel();
    wizardsValue = new javax.swing.JLabel();
    buildersLabel = new javax.swing.JLabel();
    buildersValue = new javax.swing.JLabel();
    warriorsLabel = new javax.swing.JLabel();
    warriorsValue = new javax.swing.JLabel();

    castleLabel.setText("Wysokość:");

    org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${player.castle.height}"), castleValue, org.jdesktop.beansbinding.BeanProperty.create("text"));
    binding.setSourceNullValue("0");
    binding.setSourceUnreadableValue("0");
    bindingGroup.addBinding(binding);

    wizardsLabel.setText("Magowie:");

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${player.wizards.count}"), wizardsValue, org.jdesktop.beansbinding.BeanProperty.create("text"));
    binding.setSourceNullValue("0");
    binding.setSourceUnreadableValue("0");
    bindingGroup.addBinding(binding);

    buildersLabel.setText("Budowniczy:");

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${player.builders.count}"), buildersValue, org.jdesktop.beansbinding.BeanProperty.create("text"));
    binding.setSourceNullValue("0");
    binding.setSourceUnreadableValue("0");
    bindingGroup.addBinding(binding);

    warriorsLabel.setText("Wojownicy:");

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${player.warriors.count}"), warriorsValue, org.jdesktop.beansbinding.BeanProperty.create("text"));
    binding.setSourceNullValue("0");
    binding.setSourceUnreadableValue("0");
    bindingGroup.addBinding(binding);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(castleLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
            .addComponent(castleValue))
          .addGroup(layout.createSequentialGroup()
            .addComponent(wizardsLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wizardsValue))
          .addGroup(layout.createSequentialGroup()
            .addComponent(warriorsLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(warriorsValue))
          .addGroup(layout.createSequentialGroup()
            .addComponent(buildersLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buildersValue)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(castleLabel)
          .addComponent(castleValue))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(wizardsLabel)
          .addComponent(wizardsValue))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(buildersLabel)
          .addComponent(buildersValue))
        .addGap(12, 12, 12)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(warriorsLabel)
          .addComponent(warriorsValue))
        .addContainerGap(26, Short.MAX_VALUE))
    );

    wizardsValue.getAccessibleContext().setAccessibleName("magValue");

    bindingGroup.bind();
  }// </editor-fold>//GEN-END:initComponents

  private Player player;

  public static final String PROPERTY_PLAYER = "player";

  /**
   * Get the value of player
   *
   * @return the value of player
   */
  public Player getPlayer() {
    return player;
  }

  /**
   * Set the value of player
   *
   * @param player new value of player
   */
  public void setPlayer(Player player) {
    Player oldPlayer = this.player;
    this.player = player;
    firePropertyChange(PROPERTY_PLAYER, oldPlayer, player);
  }

  
  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel buildersLabel;
  private javax.swing.JLabel buildersValue;
  private javax.swing.JLabel castleLabel;
  private javax.swing.JLabel castleValue;
  private javax.swing.JLabel warriorsLabel;
  private javax.swing.JLabel warriorsValue;
  private javax.swing.JLabel wizardsLabel;
  private javax.swing.JLabel wizardsValue;
  private org.jdesktop.beansbinding.BindingGroup bindingGroup;
  // End of variables declaration//GEN-END:variables
}
