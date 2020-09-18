package com.iamwxc.pizzaui;

import com.iamwxc.pizzaui.panels.OrderPizzaPanel;
import com.iamwxc.pizzaui.panels.StoreChoosePanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/anlowee
 * @version 1.0
 * @date 2020/9/18
 * @introduction
 * @last-check-in anlowee
 * @date 2020/9/18
 */
public class PizzaFrame extends JFrame {

    public CardLayout cardLayout;

    public final String STORE_CHOOSE_PANEL = "store_choose_panel";
    public final String ORDER_PIZZA_PANEL = "order_pizza_panel";

    public String store;
    public String type;
    public List<String> additions = new ArrayList<String>();

    public PizzaFrame() {
        setResizable(false);
        setTitle("PIZZA!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 600, 400);

        // set layout
        cardLayout = new CardLayout();
        setLayout(cardLayout);

        // add panels
        StoreChoosePanel storeChoosePanel = new StoreChoosePanel(this);
        OrderPizzaPanel orderPizzaPanel = new OrderPizzaPanel(this);

        add(STORE_CHOOSE_PANEL, storeChoosePanel);
        add(ORDER_PIZZA_PANEL, orderPizzaPanel);

        cardLayout.show(this.getContentPane(), STORE_CHOOSE_PANEL);
    }

    public static void main(String[] args) {
        PizzaFrame pizzaFrame = new PizzaFrame();
        pizzaFrame.setVisible(true);
    }

}
