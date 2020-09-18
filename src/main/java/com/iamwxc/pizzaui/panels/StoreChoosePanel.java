package com.iamwxc.pizzaui.panels;

import com.iamwxc.pizzaui.PizzaFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/18
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/18
 */
public class StoreChoosePanel extends JPanel {

    public StoreChoosePanel(final PizzaFrame pizzaFrame) {
        super();
        JButton americaStyleStoreBtn = new JButton("美式披萨店");
        JButton italyStyleStoreBtn = new JButton("意式披萨店");

        // add listener
        americaStyleStoreBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pizzaFrame.store = "america";
                pizzaFrame.cardLayout.show(pizzaFrame.getContentPane(), pizzaFrame.ORDER_PIZZA_PANEL);
            }
        });
        italyStyleStoreBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pizzaFrame.store = "italy";
                pizzaFrame.cardLayout.show(pizzaFrame.getContentPane(), pizzaFrame.ORDER_PIZZA_PANEL);
            }
        });

        add(americaStyleStoreBtn);
        add(italyStyleStoreBtn);
    }

}
